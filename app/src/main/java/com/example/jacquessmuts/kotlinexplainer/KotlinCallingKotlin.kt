package com.example.jacquessmuts.kotlinexplainer

import com.example.jacquessmuts.kotlinexplainer.javavskotlin.*

/**
 * Created by jacquessmuts on 2018/08/19
 * This is a Java class which calls Kotlin classes to see if the conversion is done right
 */
class KotlinCallingKotlin {

    fun callingStringUtils() {


        val normalizedJava = StringUtilsJava.normalize("Hello_There")
        val normalizedKotlin = StringUtilsKotlin.normalize("Hello_There")

        val splitJava = StringUtilsJava.commaSplit("Hello, sir")
        val splitKotlin = StringUtilsKotlin.commaSplit("Hello, sir")


    }

    fun callingFields() {

        val userJava = UserJava(1)
        val usernameJava = userJava.username

        val userKotlin = UserKotlin(1)

        val userKotlinWithJavaSupport = UserKotlinWithJavaSupport(1)

        val usernameKotlin = userKotlin.username
        val usernameKotlin2 = userKotlinWithJavaSupport.username

    }


    fun instances() {

        //The original method
        val userManager1 = UserManagerJava.getInstance()

        //works in kotlin, but not in Java
        val userManager2 = UserManagerKotlin.getInstance()

        //This works in kotlin and java, but then you have to change the Java code to fit
        val userManager3 = UserManagerKotlinJavaSupport.instanceB

        //Perfect
        val userManager4 = UserManagerKotlinJavaSupport.instance

    }

}
