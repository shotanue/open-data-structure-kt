package open.data.structure.kt

interface USetInterface<T> {
    fun size(): Int
    fun add(x: T)
    fun remove(x: T): T?
    fun find(x: T): T?
}

interface SSetInterface<T> {
    fun size(): Int
    fun add(x: T)
    fun remove(x: T): T?
    fun find(x: T): T?
}
