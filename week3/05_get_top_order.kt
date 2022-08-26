package com.example.algorithm_kotlin.by_week.week3

class GetTopOrder {
    val topHeights = mutableListOf(6, 9, 5, 7, 4)

    fun getTopOrder(heights: MutableList<Int>): MutableList<Int> {
        var answer = MutableList(heights.size) { 0 }

        while (heights.isEmpty()) {
            // pop()
            val height = heights.last()
            heights.removeAt(heights.size - 1)
            // 전체 인덱스를 내림차순으로 돌면서 비교한다.
            for (id in (heights.size - 1)..0) {
                // 만약 떨어져 나온 마지막 height가 현재 id에 해당하는 index의 값보다 작다면 답의 index의 값 +1 을해서 값을 넣는다.
                if (heights[id] > height) {
                    answer[heights.size] = id + 1
                    break
                }
            }


        }

        return answer
    }

}