package com.example.calculator

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var total = arrayListOf<String>()
    private var number = arrayListOf<String>()
    private var split = arrayListOf<Int>()
    private var operator = ""


    fun showString(): String = total.joinToString("")

    fun addNum(num: String) {
        total.add(num)
        number.add(num)
    }

    fun addOperator(op: String) {
        total.add(op)
        operator = op
    }

    fun calculation(): String {

        val calculation = when (operator) {
            "+" -> split[0] + split[1]
            "-" -> split[0] - split[1]
            "*" -> split[0] * split[1]
            "/" -> split[0] / split[1]
            else -> 0
        }

        clearAll()

        total.add(calculation.toString())
        number.add(calculation.toString())
        return calculation.toString()
    }

    fun splitter() {
        split.add(number.joinToString("").toInt())
        number.clear()
    }

    fun clearAll() {
        total.clear()
        split.clear()
        number.clear()

    }

}