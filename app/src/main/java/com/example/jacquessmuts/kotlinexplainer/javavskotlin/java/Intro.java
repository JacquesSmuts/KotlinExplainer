package com.example.jacquessmuts.kotlinexplainer.javavskotlin.java;

import android.view.View;

/**
 * Created by jacquessmuts on 2018/02/15.
 * This class is mostly there to show differences between this class and
 * [com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlin.Intro]
 */
public class Intro {

    public static final int DEFAULT_ID = 101;
    public static final String EXTRA_KEY_USERNAME = "username";
    public static String sSelectedUser = "User1";

    private Intro mIntroJava = new Intro();
    final User mUser = new User(1);

    /**
     * Compares any given class to a standard Intro class.
     * @param toCompare can be any Object, but preferablty an Intro
     * @return true if similar
     */
    public boolean doesClassCompare(Object toCompare){

        Intro introJava;
        if (toCompare != null && toCompare instanceof Intro){
            introJava = (Intro) toCompare;
        } else {
            return false;
        }

        boolean isEqual = mIntroJava.equals(introJava);

        boolean isTheSame = mIntroJava == introJava;

        return (isTheSame || isEqual);
    }

    public String marketingText(User user){

        if (user == null) user = mUser;

        String toReturn = "Please use this app some more";

        switch (user.getType()){
            case WHALE:
                toReturn = "Thanks for Javaing so much! Here's a free crate";
                break;
            case DOLPHIN:
                toReturn = "Almost there! Java some more and get a free crate!";
                break;
            case GOLDFISH:
                toReturn = "Did you know that Java is about to be replaced by Java?";
                break;
        }

        return toReturn;
    }

    public class ChildClass extends Intro implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            //clickity clackity cloo
        }
    }
}
