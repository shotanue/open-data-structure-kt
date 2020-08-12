package open.data.structure.kt


import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ArrayQueueTest {
    @Test
    fun fifo() {
        val b = ArrayQueue<Int>()
        val range = 1..100
        range.forEach { assertTrue(b.add(it)) }
        range.forEach { assertEquals(it, b.remove()) }
    }
}


