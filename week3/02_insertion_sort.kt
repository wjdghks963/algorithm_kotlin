package com.example.algorithm_kotlin.by_week.week3

class InsertionSort {
    val input = listOf(4, 6, 2, 9, 1)

    fun insertionSort(array: Array<Int>) {
        val n = array.size
        for (i in 0 until n) {
            // 제일 작은 값을 가진 index를 i로 두고 시작한다.
            var minIndex = i
            for (j in 0 until n - i) {
                // 비교하는 값을 두개의 값을 합치며 진행하는데
                if (array[i + j] < array[minIndex]) {
                    // 만약 두개의 값을 합한 index보다 더 큰 값을 minIndex보다 크다면 minIndex를 작은 값을 가지거ㅗ 이값을 변수에 저장
                    minIndex = i + j
                    // 변수에 값을 바꾼 후에 서로 value값을 변경한다.
                    array[i] = array[minIndex]
                    array[minIndex] = array[i]
                } else {
                    break
                }
            }

        }
        return
    }
}

