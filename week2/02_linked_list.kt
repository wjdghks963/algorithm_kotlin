package com.example.algorithm_kotlin.by_week.week2


class LinkedList<T> {

    // Node data class를 생성한다 data & next 는 제너릭으로 아무것이나 받을 수 있지만
    // next는 미리 값을 null로 설정해 다음값을 받을지 말지 결정할 수 있는 기능을 만들어놓는다.
    data class Node<T>(var data: T, var next: Node<T>? = null)

    // next로 서로 연결됨
    fun link() {
        val node1 = Node(data = 1)
        val node2 = Node(data = 2)

        node1.next = node2
    }
}