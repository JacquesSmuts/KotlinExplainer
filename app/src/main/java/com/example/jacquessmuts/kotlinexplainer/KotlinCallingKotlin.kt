package com.example.jacquessmuts.kotlinexplainer

import com.example.jacquessmuts.kotlinexplainer.javavskotlin.StringUtilsJava
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.StringUtilsKotlin
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.UserJava
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.UserKotlin
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.UserKotlinWithJavaSupport

/**
 * Created by jacquessmuts on 2018/08/19
 * This is a Java class which calls Kotlin classes to see if the conversion is done right
 */
class KotlinCallingKotlin {

    internal fun callingStringUtils() {


        val normalizedJava = StringUtilsJava.normalize("Hello_There")
        val normalizedKotlin = StringUtilsKotlin.normalize("Hello_There")

        val splitJava = StringUtilsJava.commaSplit("Hello, sir")
        val splitKotlin = StringUtilsKotlin.commaSplit("Hello, sir")


    }

    internal fun callingFields() {

        val userJava = UserJava(1)
        val usernameJava = userJava.username

        val userKotlin = UserKotlin(1)

        val userKotlinWithJavaSupport = UserKotlinWithJavaSupport(1)

        val usernameKotlin = userKotlin.username
        val usernameKotlin2 = userKotlinWithJavaSupport.username

    }

}
