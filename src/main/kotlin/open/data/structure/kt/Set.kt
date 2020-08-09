package open.data.structure.kt

interface USet<T> {
    fun size(): Int
    fun add(x: T)
    fun remove(x: T): T?
    fun find(x: T): T?
}

interface SSet<T> {
    fun size(): Int
    fun add(x: T)
    fun remove(x: T): T?
    fun find(x: T): T?
}
