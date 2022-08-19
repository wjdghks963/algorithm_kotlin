package com.example.algorithm_kotlin.by_week.week2

class IsPalindrome2 {

    val input: String = "abcba"

    fun isPalindrome(i: String): Boolean {
        // 첫번째와 마지막의 문자가 다르다면 false 반환
        if (i[0] != i[i.length - 1]) {
            return false
        }
        // 입력값의 길이가 1이하라면 true
        if (i.length <= 1) {
            return true
        }
        // 입력값을 자른 값(첫번째 값과 마지막 값을 뺀 나머지)을 input 값으로 넣으면서 재귀를 이용한다.
        return isPalindrome(i.substring(1, i.length - 1))
    }

}