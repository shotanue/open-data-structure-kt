package open.data.structure.kt

interface Queue<T> {
    fun add(x: T)
    fun remove(): T
}
