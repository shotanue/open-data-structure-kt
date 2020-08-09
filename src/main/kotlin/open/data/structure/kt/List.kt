package open.data.structure.kt

interface List<T> {
    fun size(): Int
    operator fun get(i: Int): T
    operator fun set(i: Int, x: T)
    fun remove(i: Int): T
}
