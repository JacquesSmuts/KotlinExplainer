package com.example.jacquessmuts.kotlinexplainer.kotlinexamples

/**
 * Created by jacquessmuts on 2018/02/15.
 */

import android.os.Handler
import android.util.Log
import android.widget.RelativeLayout.LayoutParams
import java.util.*
import android.widget.LinearLayout.LayoutParams as LinearLayoutParams //import renaming

class MoreKotlinExamples{


    /**
     * Example of renaming imports
     */
    fun renamingImports(){

        val layoutParams : LayoutParams
        val linearLayoutParams : LinearLayoutParams
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
                println("Field <commonName> from BasicKotlin" + this@MoreKotlinExamples.commonName)
            }
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
     * Require example
     */
    fun loginWithRequire(password: String) {
        require(password.length < 200000){ "You cannot use John Galt's Speech as a password" }
        //The password has been validated,
        //Do login stuff now
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
     * you can pass a function as a parameter
     */
    fun longAsyncFunction(asyncListenerFunction: (value: String) -> Unit){

        Handler().postDelayed({
            Thread.sleep(10000)
            asyncListenerFunction("Done")
        }, 1000)

    }

    fun longAsyncImplementation(){

        //passing a function
        longAsyncFunction(this::printValue)

        //passing a lambda
        longAsyncFunction { value ->
            println(value)
        }

        //Same as above, using 'it'
        longAsyncFunction {
            println(it)
        }

    }

    fun printValue(value: String){
        println(value)
    }

}