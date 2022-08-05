package com.example.algorithm_kotlin.week_1

import android.util.Log

class FindMaxOccurredAlphabet {
    fun find_max_occurred_alphabet(string: String): String {
        // a~z 문자 list에 추가
        val list = mutableListOf<Char>()
        for (i in 'a'..'z') {
            list.add(i.toString())
        }
        // 최고 빈도수 최고 알파벳
        var maxOccurrence = 0
        var maxAlphabet = list[0]

        // list에 있는 al
        for (al in list) {
            // 비교할 빈도수 0으로 초기화
            var occ = 0
            // input string 반복해서 만약 list에 있는 알파벳과 string의 문자와 같다면 초기화된 occ +
            for (char in string) {
                if (char.toString() == al) {
                    occ++
                }
            }
            // 만약 전역 max빈도수보다 크다면 max알파벳과 max 빈도수 교체
            if (occ > maxOccurrence) {
                maxOccurrence = occ
                maxAlphabet = al
            }
        }
        // 최고로 빈도를 많이 가진 알파벳 문자를 return
        return maxAlphabet
    }


    // result -> l
    fun result() {
        Log.d("result",find_max_occurred_alphabet("hello my name is chris"))
    }

}
