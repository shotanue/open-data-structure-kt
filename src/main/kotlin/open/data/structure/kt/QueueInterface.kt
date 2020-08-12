package open.data.structure.kt

interface QueueInterface<T> {
    fun add(x: T): Boolean
    fun remove(): T?
}
