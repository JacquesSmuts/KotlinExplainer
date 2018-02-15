package com.example.jacquessmuts.kotlinexplainer.kotlinexamples

import android.widget.RelativeLayout.LayoutParams as RelativeLayoutParams
import android.widget.LinearLayout.LayoutParams as LinearLayoutParams //import renaming

/**
 * Created by jacquessmuts on 2018/02/15.
 */

class BasicKotlinExamples {

    /**
     * Ranges
     */
    fun rangeExamples(){
        val aToZ = "a".."z"
        val overNineThousand = 1..9001
        val oddNumbers = overNineThousand.step(2).reversed()

        val isTrue = "c" in aToZ
        val isFalse = 9002 in overNineThousand
    }

    /**
     * String Examples
     */
    fun stringExamples(){
        val name = "Jacques"
        val phrase = "hello $name"
        val sentence = "hello $name. Your name has ${name.length} characters"
    }

    /**
     * Loops and Lists
     */
    fun basicLoopsAndLists(){
        var iterator = 0;
        while (iterator < 1){
            println ("The inevitable heat-death of the universe is still far away.")
            iterator = 0
        }

        val list = listOf(0, 4, 5, 1)
        for (k in list) {
            println(k)
        }

        for (j in 1..5) {
            println(j*j)
        }
    }

    /**
     * Assign value inside a try block
     */
    val success = try {
        reverseEntropy()
        true
    } catch (e: Exception) {
        println(e)
        false
    }

    /**
     * Unit is the Kotlin equivalent of void
     * Usually you wouldn't declare Unit
     */
    fun reverseEntropy() : Unit {
        throw Exception("INSUFFICIENT DATA FOR MEANINGFUL ANSWER")
    }

    /**
     * Demonstration of labels "@Outerclass" and @"InnerClass"
     */
    val commonName = 1010101;
    inner class OuterClass {
        private val commonName = 42

        inner class InnerClass {
            private val commonName = 94

            fun foo(s: String) {
                println("Field <commonName> from InnerClass" + this.commonName)
                println("Field <commonName> from InnerClass" + this@InnerClass.commonName)
                println("Field <commonName> from OuterClass" + this@OuterClass.commonName)
                println("Field <commonName> from BasicKotlin" + this@BasicKotlinExamples.commonName)
            }
        }
    }

    /**
     * This is the Kotlin equivalent of having a static variable and function
     */
    object Singleton{
        private var count = 0
        fun doSomething():Unit {
            println("Calling a doSomething (${++count} call/-s in  total)")
        }
    }

    /**
     * You can declare functions inside of functions
     */
    fun fizzbuzz(start: Int, end: Int) {

        for (k in start..end) {
            fun isFizz(): Boolean = k % 3 == 0
            fun isBuzz(): Boolean = k % 5 == 0

            when {
                isFizz() && isBuzz() -> println("Fizz Buzz")
                isFizz() -> println("Fizz")
                isBuzz() -> println("Buzz")
                else -> println(k)
            }
        }
    }

    /**
     * Require example
     */
    fun loginWithRequire(password: String) {
        require(password.length < 200000){ "You cannot use John Galt's Speech as a password" }
        //The password has been validated,
        //Do login stuff now
    }

    /**
     * Instead of declare separate functions, like the commented functions below,
     * you can declare one function and set defaults.
     */
    fun defaultValuesExample(value: Int, shouldRound: Boolean = false,
              significantNumbers: Int = 2): Float {
        return 1.0f
    }

    /**
     * You can call defaultValuesExample in many ways
     */
    fun callingDefaultValues(){

        //variables need to be passed in same order they were declared
        val one = defaultValuesExample(1)
        val two = defaultValuesExample(2, true)
        val three = defaultValuesExample(3, true, 999)

        //unless you name them :)
        val four = defaultValuesExample(significantNumbers = 999, value = 4)

    }
}