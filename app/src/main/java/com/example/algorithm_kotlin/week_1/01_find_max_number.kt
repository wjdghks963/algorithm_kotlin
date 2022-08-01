package com.example.algorithm_kotlin.week_1

import android.app.Activity

class find_max_number: Activity() {
    val list = listOf<Int>(3,5,6,1,2,4)

  fun find_max_num(list: List<Int>): Int{
      for( num in list){
          for( num2 in list){
              if(num < num2){
                  break
              }else{
                  return num
              }
          }
      }
      return 1
  }

    val result = find_max_num(list)

}