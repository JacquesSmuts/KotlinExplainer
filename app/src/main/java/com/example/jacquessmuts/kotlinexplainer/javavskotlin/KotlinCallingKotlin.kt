package com.example.jacquessmuts.kotlinexplainer.javavskotlin

import com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlinwithjavasupport.Userjk
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlinwithjavasupport.UserManagerjk

/**
 * Created by jacquessmuts on 2018/08/19
 * This is a Java class which calls Kotlin classes to see if the conversion is done right
 */
class KotlinCallingKotlin {

    fun callingStringUtils() {


        val normalizedJava = StringUtils.normalize("Hello_There")
        val normalizedKotlin = StringUtils.normalize("Hello_There")

        val splitJava = StringUtils.commaSplit("Hello, sir")
        val splitKotlin = StringUtils.commaSplit("Hello, sir")


    }

    fun callingFields() {

        val userJava = Userjk(1)
        val usernameJava = userJava.username

        val userKotlin = com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlin.Userk(1)

        val userKotlinWithJavaSupport = Userjk(1)

        val usernameKotlin = userKotlin.username
        val usernameKotlin2 = userKotlinWithJavaSupport.username

    }


    fun instances() {

        //The original method
        val userManager1 = UserManagerjk.getInstance()

        //works in kotlin, but not in Java
        val userManager2 = UserManagerjk.getInstance()

        //This works in kotlin and java, but then you have to change the Java code to fit
        val userManager3 = UserManagerjk.instanceB

        //Perfect
        val userManager4 = UserManagerjk.INSTANCE

    }

}
