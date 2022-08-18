package com.example.algorithm_kotlin.by_week.week2

class Factorial {
    fun fac(n: Int): Int {
        // 1이라면 1 리턴
        if(n == 1){
            return 1
        }
        // 재귀로 1씩 - 하며 입력값에 곱함
        return n * fac(n - 1)
    }
}