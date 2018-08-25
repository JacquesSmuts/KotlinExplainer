package com.example.jacquessmuts.kotlinexplainer.javavskotlin.java;

/**
 * Try converting this class to Kotlin. It doesn't work so well, then compare with
 * [com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlin.UserManagerk]
 */
public class UserManager {

    private static UserManager instance;

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }

        return instance;
    }

}
