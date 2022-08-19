package com.example.algorithm_kotlin.by_week.week2

class IsPalindrome {

    val str: String = "abcba"

    fun isPalindrome(i: String): Boolean {
        // 입력값의 사이즈 값 구함
        val n: Int = i.length
        // 0~문자열의 사이즈 만큼의 반복문을 실행한다.
        for (index in 0..n) {
            // 만약 input값의 index번째의 값과 마지막번째의 값이 다르다면 false를 반환한다.
            if (i[index] != i[n - 1 - index]) {
                return false
            }
        }
        // for문 내에서 return이 발생하지 않고 빠져나온다면 true를 반환한다.
        return true
    }


}