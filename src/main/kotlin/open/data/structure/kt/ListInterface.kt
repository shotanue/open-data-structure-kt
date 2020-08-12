package open.data.structure.kt

interface ListInterface<T> {
    fun size(): Int
    operator fun get(i: Int): T
    operator fun set(i: Int, x: T): T
    fun remove(i: Int): T
}
