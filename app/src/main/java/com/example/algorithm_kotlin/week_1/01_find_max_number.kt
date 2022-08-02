package com.example.algorithm_kotlin.week_1

import android.app.Activity

class FindMaxNumber01 : Activity() {
    // 배열 선언
    val list = listOf<Int>(3, 5, 6, 1, 2, 4)

    // 함수 선언 return 값은 Int형
    fun find_max_num(list: List<Int>): Int {
        for (num in list) {
            // list안의 하나의 value1를 잡아서
            for (num2 in list) {
                // list안의 하나의 value1과 대조할 것을 잡아 if문 안에서  더 큰 값이 있다면 잡는다
                if (num < num2) {
                    break
                } else {
                    return num
                }
            }
        }
        return 1
    }

    val result = find_max_num(list)

}
