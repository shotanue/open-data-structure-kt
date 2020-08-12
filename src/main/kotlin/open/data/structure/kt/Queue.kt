package open.data.structure.kt

import kotlin.math.max

interface Queue<T> {
    fun add(x: T): Boolean
    fun remove(): T?
}

class ArrayQueue<T> : Queue<T> {
    private var a: Array<Any?> = arrayOfNulls(0)
    private var j: Int = 0
    private var n: Int = 0

    private fun resize() {
        val b: Array<Any?> = arrayOfNulls(max(2 * n, 1))
        if (this.a.isNotEmpty()) for (k in 0..n) {
            b[k] = this.a[(j + k) % this.a.size]
        }
        this.a = b
        j = 0
    }

    override fun add(x: T): Boolean {
        val isFull = this.n + 1 >= this.a.size
        if (isFull) this.resize()
        a[(j + n) % a.size] = x
        n++
        return true
    }

    override fun remove(): T? {
        val x = this.a[this.j]
        this.j = (j + 1) % this.a.size
        n--
        val isSparse = a.size >= 3 * n
        if (isSparse) resize()
        @Suppress("UNCHECKED_CAST")
        return x as T?
    }
}
