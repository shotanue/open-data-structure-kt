package open.data.structure.kt


import kotlin.test.Test
import kotlin.test.assertEquals

class ArrayStackTest {
    @Test
    fun testCRUD() {
        val a = ArrayStack<Int?>()
        assertEquals(a.size(), 0)

        a.push(1)
        a.push(2)
        a.push(3)
        assertEquals(a[0], 1)
        assertEquals(a[1], 2)
        assertEquals(a[2], 3)

        assertEquals(3, a.pop())
        assertEquals(2, a.pop())
        assertEquals(1, a.pop())
    }
}


