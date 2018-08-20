package com.example.jacquessmuts.kotlinexplainer.kotlinexamples

/**
 * Created by jacquessmuts on 2018/02/15.
 */
class KotlinNullExamples {

    /**
     * How to do it wrong
     */
    fun doingItWrong(){
        val name: String = null // does not compile, because there is no "?" operator

        val greeting = "hello"
        greeting = null // does not compile, because there is no "?" operator
    }

    /**
     * Using ? to make everything safe
     */
    fun nullableExamples() {

        //The ? makes variables nullable
        val nullableName: String? = null
        var alsoNullableName: String? = "Jacques"
        alsoNullableName = null

        val notNullName: String = "Javert"
        val maybeNullName: String? = "Prisoner 24601"

        println(notNullName.length) //fine because it's not nullable

        println(maybeNullName.length) //error because it may be null

        if (maybeNullName != null) {
            println(maybeNullName.length) //it won't crash, but can be better
        }

        println(maybeNullName?.length) //same as above, but better

    }

    /**
     * Using !! to assert variable as not-null
     */
    fun assertNotNullExamples(){

        val maybeNullName: String? = "Jean Valjean"
        val notNull: String = maybeNullName //error because it's casting a nullable to a not-null

        val definitelyNotNull: String = maybeNullName!! //I assert it's not null with !!
    }

    /**
     * Using the Elvis operator
     */
    fun elvisMakesDefault(){

        var probablyNullName: String? = "Javert"
        probablyNullName = null

        //Elvis Operator, because " ?:) " looks like Elvis
        val notNullName: String = probablyNullName ?: "Prisoner 24601" //if null, use default
    }

}