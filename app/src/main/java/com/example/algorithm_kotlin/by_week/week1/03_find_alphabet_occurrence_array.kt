package com.example.algorithm_kotlin.by_week.week1

class FindAlphabetOccurrenceArray {
    fun find_alphabet_occurrence_array(string: String): MutableList<Int> {
        // 0으로 채워진 26개의 수정 가능한 배열을 생성
        val list = MutableList(26) { 0 }

        for (index in string) {
            // index가 알파벳인지 확인 후
            if (index.toString() in "A".."Z" && index.toString() in "a".."z") {
                // 아스키 코드로 변환
                var arrIndex: Int = index.toInt() - "a".toInt()
                // 알파벳 순서에 따라 해당하는 index의 숫자 증가
                list[arrIndex] += 1
            } else {
                continue
            }
        }
        // 결과 : 들어온 string에서 a..z에 해당하는 index에 해당하는 갯수 만큼의 숫자가 들어있음
        // ex) aaa -> 0번째 index에 3
        return list
    }


}