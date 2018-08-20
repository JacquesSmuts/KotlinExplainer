package com.example.jacquessmuts.kotlinexplainer.javavskotlin;

/**
 * Try converting this class to Kotlin. It doesn't work so well, then compare with
 * [com.example.jacquessmuts.kotlinexplainer.javavskotlin.UserManagerKotlin]
 */
public class UserManagerJava {

    private static UserManagerJava instance;

    public static UserManagerJava getInstance() {
        if (instance == null) {
            instance = new UserManagerJava();
        }

        return instance;
    }

}
