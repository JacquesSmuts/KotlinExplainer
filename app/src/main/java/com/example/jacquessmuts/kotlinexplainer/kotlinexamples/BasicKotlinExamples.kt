package com.example.jacquessmuts.kotlinexplainer.kotlinexamples

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
     * varargs are handled easily
     */
    fun loopingThroughVarargs(vararg strings:String){
        for (stringy in strings){
            println(stringy)
        }
    }

    /**
     * You can pass varargs easily from an array, using the *spread operator
     */
    fun callingTheVarArg(){

        //pass arbitrary number of strings
        loopingThroughVarargs("hi", "hello")

        //use an array with the *spread operator
        val arrayOfStrings = arrayOf<String> ("hi", "hello", "hello there")
        loopingThroughVarargs(*arrayOfStrings)

        //or use a List/Collection
        val listOfStrings = listOf("hi", "hello", "hello there", "General Kenobi")
        loopingThroughVarargs(*listOfStrings) //the *spread operator doesn't work on lists

        loopingThroughVarargs(*listOfStrings.toTypedArray())  //create an array from the list first
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
     * Instead of declaring separate functions
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