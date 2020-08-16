package open.data.structure.kt

import kotlin.math.max

class BinaryTree<N>(val r: BTNode<N>? = null) {
    companion object {
        data class BTNode<N>(var left: BTNode<N>?, var right: BTNode<N>?, var parent: BTNode<N>?)
    }

    fun <N> depth(u: BTNode<N>): Int {
        var d = 0
        var u = u
        while (u != this.r) {
            u = u.parent!!
            d++
        }
        return d
    }

    fun size(): Int {
        if (this.r == null) {
            return 0
        }
        return size(this.r)
    }

    private fun <N> size(u: BTNode<N>?): Int {
        if (u == null) {
            return 0
        }
        return 1 + size(u.left) + size(u.right)
    }

    fun height(): Int {
        if (this.r == null) {
            return 0
        }
        return height(this.r)
    }

    private fun <N> height(u: BTNode<N>?): Int {
        if (u == null) {
            return 0
        }
        return 1 + max(height(u.left), height(u.right))
    }
}
