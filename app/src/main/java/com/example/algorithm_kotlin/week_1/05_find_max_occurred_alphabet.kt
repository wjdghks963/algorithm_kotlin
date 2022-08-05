package com.example.algorithm_kotlin.week_1

import android.util.Log

class FindMaxOccurredAlphabet {
    fun find_max_occurred_alphabet(string: String): MutableList<Int>  {
        // 0으로 채워진 26개의 수정 가능한 배열을 생성
        val list = MutableList(26) { 0 }
        
        // 최고 빈도수 최고 알파벳 index
        var maxOcc = 0
        var maxAlIndex = 0

        // list에 있는 al을 비교해서 해당하는 알파벳 갯수를 알파벳 순서에 맞게 넣는다
        for (al in string) {
           if (index.toString() in 'A'..'Z' && index.toString() in 'a'..'z'){
             var index = al.toInt() - 'a'.toInt()
             list[index] += 1
           }else{
             continue
           }
        }
        
        for(index in list.size){
            var alOcc = list[index]
            if(alOcc > maxOcc){
                maxAlIndex = index
                maxOcc = alOcc
            }
        }
        return (maxAlIndex + 'a'.toInt()).toChar
    }


    // result -> l
    fun result() {
        Log.d("result",find_max_occurred_alphabet("hello my name is chris"))
    }

}
Footer
