package com.example.algorithm_kotlin.by_week.week3

class WhatIsStack<Any> {
    data class Node<T>(var data: T, var next: Node<T>? = null)

    private var headNode: Node<Any>? = null

    fun push(value: Any) {
        // ㅅㅐ로운 headnode 생성
        var newHead = Node(data = value)
        // 새로운 head의 다음은 지금 가지고 있는 headnode
        newHead.next = this.headNode
        // 새롭게 변한 headnode는 새롭게 만들어진 node 즉 위치 변경으로 새로운 노드를 아래로 깔리고 이제 this의 헤드노드는 위로
        this.headNode = newHead
    }

    fun pop(): Node<Any>? {
        // 만약 스택이 비었다면 리턴
        if (isEmpty()) {
            return null
        }
        // 삭제 노드는 스택의 구조인 FILO를 따라 헤드가 나온다.
        var deleteNode = this.headNode
        this.headNode = this.headNode?.next

        return deleteNode
    }


    fun peek(): Any? {
        if (isEmpty()) {
            return null
        }
        // head의 데이터 리턴
        return this.headNode?.data
    }

    fun isEmpty(): Boolean {
        return this.headNode == null
    }
}