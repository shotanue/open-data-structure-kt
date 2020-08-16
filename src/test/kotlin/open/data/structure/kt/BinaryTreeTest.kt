package open.data.structure.kt

import kotlin.test.Test
import kotlin.test.assertEquals

class BinaryTreeTest {
    @Test
    fun btree() {
        var bt = create()
        assertEquals(4, bt.size()) // r -> n1 --> n2 --> n4
        assertEquals(3, bt.height()) // r -> left(n1 --> n2 --> n4), right(n3)
    }

    fun create(): BinaryTree<Int> {
        var n1 = BinaryTree.Companion.BTNode<Int>(left = null, parent = null, right = null)
        var n2 = BinaryTree.Companion.BTNode<Int>(left = null, parent = null, right = null)
        var n3 = BinaryTree.Companion.BTNode<Int>(left = null, parent = null, right = null)
        var n4 = BinaryTree.Companion.BTNode<Int>(left = null, parent = null, right = null)

        n1.left = n2
        n2.parent = n1
        n1.right = n3
        n3.parent = n1
        n2.right = n4
        n4.parent = n2

        return BinaryTree<Int>(r = n1)
    }
}


