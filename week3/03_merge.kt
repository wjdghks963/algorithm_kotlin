package com.example.algorithm_kotlin.by_week.week3

class MergeList {

    val arrA: ArrayList<Int> = arrayListOf(1, 2, 3, 5)
    val arrB: ArrayList<Int> = arrayListOf(4, 6, 7, 8)


    fun merge(arr1: ArrayList<Int>, arr2: ArrayList<Int>): ArrayList<Int> {
        val arrC = arrayListOf<Int>()

        var arr1Index = 0
        var arr2Index = 0
        // 첫번째와 두번째 array의 index가 해당 array가 가질 수 있는 index의 끝까지 갈때까지
        while (arr1Index < arr1.size && arr2Index < arr2.size) {
            // 만약 첫번째 array의 값이 두번째 array의 값보다 작다면
            // ex) arr1 -> 1,2,3  arr2 -> 4,5,6
            if (arr1[arr1Index] < arr2[arr2Index]) {
                // 새로 만든 배열의 값에 해당 작은 값을 추가하고
                // ex) arrC = [1]
                arrC.add(arr1[arr1Index])
                // 첫번쨰 array의 다음 index로 넘긴다.
                arr1Index += 1
            } else {
                // 만약 그 반대라면 두번째 arr의 값을 넣고 index를 다음으로 넘긴다.
                arrC.add(arr2[arr2Index])
                arr2Index += 1
            }

            // 만약 첫번째 arr의 끝까지 왔다면
            if (arr1Index == arr1.size) {
                // 첫번째 arr의 끝까지 갈때까지
                while (arr2Index < arr2.size) {
                    // 새로 만든 arr에 계속해서 넣는다
                    arrC.add(arr2[arr2Index])
                    arr2Index += 1
                }
            }

            // 만약 두번째 arr의 끝까지 왔다면
            if (arr2Index == arr2.size) {
                // 첫번째 arr의 끝까지 갈때까지
                while (arr1Index < arr1.size) {
                    // 새로 만든 arr에 계속해서 넣는다
                    arrC.add(arr1[arr1Index])
                    arr1Index += 1
                }
            }


        }
        return arrC
    }
}