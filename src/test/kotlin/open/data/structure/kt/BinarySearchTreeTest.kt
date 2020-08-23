package open.data.structure.kt

import kotlin.test.Test
import kotlin.test.assertEquals

class BinarySearchTreeTest {
    @Test
    fun testAdd() {
        val tree = BinarySearchTree<Int>()
        for (x in 1..10) {
            tree.add(x)
        }
        assertEquals(10, tree.n)
    }

    @Test
    fun testFind() {
        val tree = BinarySearchTree<Int>()
        for (x in 1..10) {
            tree.add(x)
        }
        assertEquals(2, tree.findEQ(2))
        assertEquals(null, tree.findEQ(11))
    }

    @Test
    fun testRemove() {
        val tree = BinarySearchTree<Int>()
        for (x in 1..10) {
            tree.add(x)
        }
        assertEquals(2, tree.findEQ(2))
        tree.remove(2)
        assertEquals(tree.n, 9)
        assertEquals(tree.findEQ(2), null)
    }
}


