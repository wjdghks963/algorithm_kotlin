package com.example.algorithm_kotlin.by_week.week2


class SumLinkedList<T> {
    data class Node<T>(var data: T, var next: Node<T>? = null)

    private var headNode: Node<T>? = null
    private var tailNode: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
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

}


fun getLinkedListTwoSum(list1, list2){
  var sum1 = getLinkedListSum(list1)
  var sum2 = getLinkedListSum(list2)
  
  return sum1+sum2
}

fun getLinkedListSum(list){
  var sum = 0
  var head = list.head
  while(head !== null){
    sum = sum + head.data
    head = head.next
  }
  return sum
}
