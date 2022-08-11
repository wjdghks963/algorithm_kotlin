package com.example.algorithm_kotlin.by_week.week2

    class RemoveLinkedList<T> {
        data class Node<T>(var data: T, var next: Node<T>? = null)

        private var headNode: Node<T>? = null
        private var tailNode: Node<T>? = null
        private var size = 0


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

        fun push(data: T) {
            headNode = Node(data = data, next = headNode)
            // 마지막 값이 없다면 마지막 값은 방금 추가한 값이 된다.
            if (tailNode == null) {
                tailNode = headNode
            }
            // 길이가 늘어났으니 길이 ++
            size++
        }

        // 값이 있는 위치의 연결을 끊는다.
        fun deleteNode(i: Int) {
            val list = RemoveLinkedList<Int>()
            list.push(1)
            list.push(2)

            if (i == 0) {
                headNode = headNode.next
            }
            val node = list.nodeAt(i - 1)
            node?.next = node?.next?.next
        }

    }
