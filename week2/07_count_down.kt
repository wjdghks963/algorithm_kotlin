package com.example.algorithm_kotlin.by_week.week2

class CountDown {

    private fun countDown(number: Int){
        // 숫자가 0 미만이라면 스탑
        if(number < 0){
            return
        }else{
            // 아니라면 숫자를 계속해서 출력
            println(number)
        }
        // 재귀로 자신을 부르는데 입력된 값에 -1을 하며 호출한다.
        countDown(number -1)
    }


}