package open.data.structure.kt

interface ListInterface<T> {
    fun size(): Int
    operator fun get(i: Int): T
    operator fun set(i: Int, x: T): T
    fun remove(i: Int): T
}

interface QueueInterface<T> {
    fun add(x: T): Boolean
    fun remove(): T?
}

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

