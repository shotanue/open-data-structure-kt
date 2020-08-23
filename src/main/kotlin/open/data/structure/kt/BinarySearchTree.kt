package open.data.structure.kt

data class BinarySearchTree<T : Comparable<T>>(
        private var r: BTNode<T>? = null,
        var n: Int = 0
) {
    companion object {
        data class BTNode<N>(
                var left: BTNode<N>? = null,
                var right: BTNode<N>? = null,
                var parent: BTNode<N>? = null,
                var x: N
        )
    }

    fun findEQ(x: T): T? {
        var w = this.r
        while (w != null) {
            val comp = x.compareTo(w.x)
            w = when {
                comp < 0 -> w.left
                comp > 0 -> w.right
                else -> return w.x
            }
        }
        return null
    }

    fun find(x: T): T? {
        var w = this.r
        var z: BTNode<T>? = null
        while (w != null) {
            val comp = x.compareTo(w.x)
            w = when {
                comp < 0 -> {
                    z = w
                    w.left
                }
                comp > 0 -> {
                    w.right
                }
                else -> {
                    return w.x
                }
            }
        }
        if (z == null) {
            return null
        }
        return z.x
    }

    private fun findLast(x: T): BTNode<T>? {
        var w = this.r
        var prev: BTNode<T>? = null
        while (w != null) {
            prev = w
            val comp = x.compareTo(w.x)
            w = when {
                comp < 0 -> w.left
                comp > 0 -> w.right
                else -> return w
            }
        }
        return prev
    }

    fun add(x: T): Boolean {
        val p = findLast(x)
        val u = BTNode(x = x)
        return addChild(p, u)
    }

    private fun addChild(p: BTNode<T>?, u: BTNode<T>): Boolean {
        if (p == null) {
            this.r = u
        } else {
            val comp = u.x.compareTo(p.x)
            when {
                comp < 0 -> p.left = u
                comp > 0 -> p.right = u
                else -> return false
            }
            u.parent = p
        }
        this.n++
        return true
    }

    private fun splice(target: BTNode<T>) {
        val tParent: BTNode<T>?
        val tChild: BTNode<T>? = if (target.left != null) target.left else target.right

        val targetIsRoot = target == this.r
        when {
            targetIsRoot -> {
                this.r = tChild
                tParent = null
            }
            else -> {
                tParent = target.parent

                when (tParent?.left) {
                    target -> tParent.left = tChild
                    else -> tParent?.right = tChild
                }
            }
        }
        if (tChild != null) tChild.parent = tParent
        this.n--
    }

    fun remove(target: T) {
        val u = findLast(target)!!
        val lessThanTwoNodes = u.left == null || u.right == null
        return when {
            lessThanTwoNodes -> splice(u)
            else -> {
                var w: BTNode<T> = u.right!!
                while (w.left != null) w = w.left!!
                u.x = w.x
                splice(w)
            }
        }
    }
}


