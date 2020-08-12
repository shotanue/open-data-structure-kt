package open.data.structure.kt

import kotlin.math.max

class ArrayStack<T> : ListInterface<T> {
    private var a: Array<Any?> = arrayOfNulls(0)
    private var n: Int = 0

    override fun size(): Int = this.n

    @Suppress("UNCHECKED_CAST")
    override fun get(i: Int): T = this.a[i] as T

    override fun set(i: Int, x: T): T {
        val y = this.a[i]
        a[i] = x
        @Suppress("UNCHECKED_CAST")
        return y as T
    }

    override fun remove(i: Int): T {
        val x = a[i]
        var j = i
        while (j < n - 1) {
            a[j] = a[j + 1]
            j++
        }
        this.n--
        val isSparse = a.size >= 3 * n
        if (isSparse) this.resize()

        @Suppress("UNCHECKED_CAST")
        return x as T
    }


    fun push(x: T) = this.add(this.n, x)
    fun pop(): T = this.remove(this.n - 1)

    private fun add(i: Int, x: T) {
        val isFull = this.n + 1 >= this.a.size
        if (isFull) this.resize()
        // calling max() is for preventing "index out of bounds" against this.a
        for (j in this.n downTo max(i, 1)) {
            a[j] = a[j - 1]
        }
        a[i] = x
        this.n++
    }

    private fun resize() {
        val b: Array<Any?> = arrayOfNulls(max(2 * n, 1))
        if (this.a.isNotEmpty()) {
            for (i in 0 until n) {
                b[i] = a[i]
            }
        }
        this.a = b
    }
}
