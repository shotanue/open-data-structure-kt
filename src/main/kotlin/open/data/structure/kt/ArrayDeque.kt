package open.data.structure.kt

class ArrayDeque<T> : ListInterface<T> {
    private var a: Array<Any?> = arrayOfNulls(0)
    private var j: Int = 0
    private var n: Int = 0

    override fun size(): Int {
        TODO("Not yet implemented")
    }

    @Suppress("UNCHECKED_CAST")
    override fun get(i: Int): T = this.a[(j + i) % this.a.size] as T

    override fun set(i: Int, x: T): T {
        @Suppress("UNCHECKED_CAST")
        val y = this.a[(j + i) % this.a.size] as T
        this.a[(j + i) % this.a.size] = x
        return y
    }

    fun add(i:Int, x:T){
        TODO("Not yet implemented")
    }

    override fun remove(i: Int): T {
        TODO("Not yet implemented")
    }
}
