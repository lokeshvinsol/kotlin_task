package tasks

class DoublyLinkList {
    var head: Node? = null

    inner class Node(var value: Int) {
        var prev: Node? = null
        var next: Node? = null
    }


    fun pushNode(prevNode: Node?, data: Int) {

        if (prevNode == null) return

        val node = Node(data)
        node.next = prevNode.next
        prevNode.next = node
        node.prev = prevNode

        if (node.next != null)
            node.next!!.prev = node
    }


    fun createNewNode(data: Int) {
        val newNode = Node(data)
        var end = head

        newNode.next = null

        if (head == null) {
            newNode.prev = null
            head = newNode
            return
        }

        while (end!!.next != null) {
            end = end.next
        }

        end.next = newNode
        newNode.prev = end
    }


    fun printDLL(node: Node?) {
        var node = node
        while (node != null){
            print(node.value.toString() + " ")
            node = node.next
        }
    }

    fun addAfterValue(insertAfter: Int, valueToInsert: Int){

        if (head == null)  return
        var end = head

        while (end!!.next != null){
            if (end.value == insertAfter){
                pushNode(end, valueToInsert)
                return
            }

            end = end.next
        }
    }

}



fun main() {
    val dll = DoublyLinkList()
    dll.createNewNode(1)
    dll.createNewNode(2)
    dll.createNewNode(3)
    dll.createNewNode(4)
    dll.pushNode(dll.head!!.next, 5)
    dll.pushNode(dll.head!!.next, 6)

    dll.addAfterValue(6, 0)
    dll.printDLL(dll.head)

}