package com.example.algorithm_kotlin.by_week.week1

class FindMaxNumber02 {
    val list = listOf(3,5,6,1,2,4)

    fun findMaxNum(list:List<Int>): Int {
        // 우선 제일 큰 수를 뜻하는 변수를 선언한다
        var maxNum = list[0]
        // 반복문을 통해 list 안에서 변수에 저장되는 값보다 큰값이 있다면 변수에 저장한다.
        for (num in list){
            if(num > maxNum){
                maxNum = num
            }
        }
        return maxNum
    }

}