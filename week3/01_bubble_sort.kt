package com.example.algorithm_kotlin.by_week.week3

class BubbleSort {

    // index 값 변경이 가능한 arraylist를 사용한다.
    val input: ArrayList<Int> = arrayListOf(4, 6, 2, 9, 1)

    fun bubbleSort(list: Array<Int>) {
        val n = list.size
        // .. range는 범위의 까지 until은 전까지
        for (i in 0 until n) {
            for (j in 0 until n - i) {
                // 하나씩 잡고 비교해 가며 제일 큰 숫자를 마지막 index에 넣는다
                if (list[j] > list[j + 1]) {
                    list[j] = list[j + 1]
                    list[j + 1] = list[j]
                }
            }
        }
        return
    }
}