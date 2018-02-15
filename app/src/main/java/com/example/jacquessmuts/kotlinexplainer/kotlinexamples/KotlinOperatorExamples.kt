package com.example.jacquessmuts.kotlinexplainer.kotlinexamples

import java.util.*

/**
 * Created by jacquessmuts on 2018/02/15.
 *
 * Many more examples of Operator Overloading here:
 * https://kotlinlang.org/docs/reference/operator-overloading.html
 *
 */
class KotlinOperatorExamples{

    /**
     * Demonstration of "to" keyword
     */
    fun pairsExample() {
        val pair1 = Pair("altcoin", "Litecoin")
        val pair2 = "altcoin" to "Litecoin"
    }

    /**
     * Create your own operators using infix
     */
    class BitcoinPrice {
        var valueInDollars = 8000.00
        infix fun recalculate(secondsPassed: Int): Unit {
            this.valueInDollars = (secondsPassed * (Random().nextInt(10)  -  5)).toDouble()
        }
    }

    /**
     * Demonstration of infix usage
     */
    fun infixExample(){
        var currentValue = BitcoinPrice()
        currentValue.recalculate(60*60) //call the function normally
        currentValue recalculate 60*60 //or as an operator, thanks to infix
    }

    /**
     * An example of a class with some Overloaded Operators
     */
    private class OverloadedClass(var one: Int, var two: Int){

        //class + int
        operator fun plus(increment: Int): OverloadedClass {
            return OverloadedClass(one+increment, two+increment)
        }

        //class + class
        operator fun plus(increment: OverloadedClass): OverloadedClass {
            return OverloadedClass(one+increment.one, two+increment.two)
        }

        //class++
        operator fun inc(): OverloadedClass {
            return OverloadedClass(one+1, two+1)
        }

        //class in class
        operator fun contains(passedClass: OverloadedClass) : Boolean {
            return (passedClass.one == one || passedClass.two == two)
        }

        //class in class
        operator fun contains(integer: Int) : Boolean {
            return (integer == one || integer == two)
        }

    }

    fun overloadedClassUsage(){

        var overloadedClass = OverloadedClass(1, 2)

        //any class can be defined for the plus operator
        overloadedClass = overloadedClass + 2
        overloadedClass = overloadedClass + overloadedClass

        //the inc operator
        overloadedClass ++

        //the "in" operator calls the "contains" function
        val isFalse = 1 in overloadedClass
        val isAlsoFalse = OverloadedClass(1, 1) in overloadedClass
    }
}