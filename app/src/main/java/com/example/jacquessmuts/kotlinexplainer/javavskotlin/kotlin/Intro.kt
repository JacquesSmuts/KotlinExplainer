package com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlin

import android.view.View

/**
 * Created by jacquessmuts on 2018/02/15.
 * This is a conversion, with notes, of the Intro class here:
 * [com.example.jacquessmuts.kotlinexplainer.javavskotlin.java.Intro]
 */

open class Intro {

    //companion object is a safely managed static class, shared among all instances of this class
    companion object {
        val DEFAULT_ID = 101 // same public final static int
        const val EXTRA_KEY_USERNAME = "username" //const keyword
        var sSelectedUser = "User1" //same as public static String, but safer
    }

    const val EXTRA_THINGY = "bob" //const must be inside companion object

    private val mIntroKotlin = Intro()
    internal val mUserKotlin = Userk(1)

    /**
     * Compares any given class to a standard Intro class.
     * @param toCompare can be any Object, but preferablty an Intro
     * @return true if similar
     */
    fun doesClassCompare(toCompare: Any?): Boolean {

        val introKotlin: Intro
        if (toCompare != null && toCompare is Intro) {
            introKotlin = toCompare
        } else {
            return false
        }

        val isEqual = mIntroKotlin == introKotlin

        val isTheSame = mIntroKotlin === introKotlin

        return isTheSame || isEqual
    }

    /**
     * Example of using "when" instead of switch
     */
    fun marketingText(userKotlin: Userk?): String {
        var userKotlin = userKotlin

        if (userKotlin == null) userKotlin = mUserKotlin

        var toReturn = "Please use this app some more"

        when (userKotlin.type) {
            Userk.Type.WHALE ->
                toReturn = "Thanks for Kotlining so much! Here's a free crate"
            Userk.Type.DOLPHIN ->
                toReturn = "Almost there! Kotlin some more and get a free crate!"
            Userk.Type.GOLDFISH ->
                toReturn = "Did you know that Kotlin is about to be replaced by Kotlin?"
        }

        return toReturn
    }

    /**
     * An inner class is only accessible from within the parent class
     */
    inner class ChildClass : Intro(), View.OnClickListener {
        override fun onClick(view: View) {
            //clickity clackity cloo
        }
    }
}
