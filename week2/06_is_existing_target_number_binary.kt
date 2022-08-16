package com.example.algorithm_kotlin.by_week.week2

import android.app.Activity


class IsExistingTargetNumberBinary : Activity() {
    val target: Int = 14
    val nums = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)

    fun findBinary(target: Int, array: List<Int>): Boolean {
        // 현재 작은 index
        var curMin = 0
        // 현재 제일 큰 index
        var curMax = array.size - 1
        // double 형태로 두개 의 값을 나눈 값을 구함
        var curGuess = (curMin + curMax) / 2


        while (curMin <= curMax) {
            // 만약 유추한 index의 값이 target과 같다면 true 반환 후 종료
            if (array[curGuess] == target) {
                return true
            } else if (array[curGuess] < target) {
                // 만약 타켓 보다 작다면 curMin의 값을 +1
                curMin = curGuess + 1
            } else {
                // 만약 타켓보다 크다면 curMax의 값을 -1
                curMax = curGuess - 1
            }
            // 조건에 따라 갈린 값을 더해 다시 반으로 나눈 후 몫을 이용해 while 문을 반복한다.
            curGuess = (curMin + curMax) / 2
        }
        return false
    }


}
