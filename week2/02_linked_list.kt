package com.example.algorithm_kotlin.by_week.week2

// Node data class를 생성한다 data & next 는 제너릭으로 아무것이나 받을 수 있지만 
// next는 미리 값을 null로 설정해 다음값을 받을지 말지 결정할 수 있는 기능을 만들어놓는다.
data class Node<T>(var data: T, var next: Node<T>? = null)


class LinkedList<T> {

    private var headNode: Node<T>? = null
    private var tailNode: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    // 맨 앞에 값을 추가하는 push
    fun push(data: T) {
        headNode = Node(data = data, next = headNode)
        // 마지막 값이 없다면 마지막 값은 방금 추가한 값이 된다.
        if (tailNode == null) {
            tailNode = headNode
        }
        // 길이가 늘어났으니 길이 ++
        size++
    }

    // 맨 뒤에 값을 추가하는 append
    fun append(data: T) {
        // 만약 리스트가 비었다면 push 함수를 이용해서 리스트를 채운다.
        if (isEmpty()) {
            push(data)
            return
        }

        // 만약 비어있지 않는다면 tailnode의 next에 값을 추가한다.
        tailNode?.next = Node(data = data)

        // 이제 tailnode는 방금 바뀐애라고 변수에 값을 넣어준다. 
        tailNode = tailNode?.next
        size++
    }


    // 위치의 값을 찾는 nodeAt
    fun nodeAt(index: Int): Node<T>? {
        // 현재값은 headNode라고 초기화하는 변수를 선언
        var cur = headNode
        var curIndex = 0

        // 현재 노드가 null이 아리고 찾는 index가 현재 index보다 크면 종료
        while (cur != null && curIndex < index) {
            // 현재 노드는 현재 노드의 다음것이라고 할당
            cur = cur.next
            // 현재 노드의 index 증가
            curIndex++
        }
        // 마지막으로 찾는 index의 값을 반환
        return cur
    }

    // 값을 삽입하는 insert
    fun inset(data: T, afterNode: Node<T>): Node<T> {
        // 만약 tailnode와 들어올 노드의 값이 같다면 append를 사용해서 붙힌다.
        if (tailNode == afterNode) {
            append(data)
            return tailNode!!
        }

        // 새로운 노드는 들어온 노드의 값 다음이다.
        val newNode = Node(data = data, next = afterNode.next)

        // 들어온 노드의 다음은 새로운 노드라고 재할당해준다
        afterNode.next = newNode
        size++
        return newNode
    }


}


// next로 서로 연결됨
fun link() {
    val node1 = Node(data = 1)
    val node2 = Node(data = 2)

    node1.next = node2
}

// append를 사용해봄
fun tryAppend(){
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    println("$list") // 1 2 3

    var indexOne = list.nodeAt(1)!! // 2

    for( i in 1..3){
        indexOne = list.inset(-1 * i, indexOne)
    }
    println("$list") // 1 2 -1 -2 -3 3
}