package com.example.jacquessmuts.kotlinexplainer;

import com.example.jacquessmuts.kotlinexplainer.javavskotlin.StringUtilsJava;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.StringUtilsKotlin;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.UserManagerJava;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.UserManagerKotlin;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.UserManagerKotlinJavaSupport;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.UserJava;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.UserKotlin;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.UserKotlinWithJavaSupport;

/**
 * Created by jacquessmuts on 2018/08/19
 * This is a Java class which calls Kotlin classes to see if the conversion is done
 */
public class JavaCallingKotlin {




    void callingStringUtils(){

        //this is the original
        String normalizedJava = StringUtilsJava.normalize("Hello_There");

        //This doesn't work, because normalize has not been exposed as a static yet
        String normalizedKotlin = StringUtilsKotlin.normalize("Hello_There");

        //this is the original
        String[] splitJava = StringUtilsJava.commaSplit("Hello, sir");

        //this works because commaSplit has been annotated with @JvmStatic
        String[] splitKotlin = StringUtilsKotlin.commaSplit("Hello, sir");
    }

    void callingFields(){

        UserJava userJava = new UserJava(1);
        String usernameJava = userJava.username; //it's a public variable

        //doesn't work
        UserKotlin userKotlin = new UserKotlin(1);

        //works, because [@JvmOverloads constructor] has been added
        UserKotlinWithJavaSupport userKotlinWithJavaSupport = new UserKotlinWithJavaSupport(1);

        String usernameKotlin = userKotlin.username; //doesn't work

        String usernameKotlin2 = userKotlinWithJavaSupport.username; //works, because [@JvmField]

    }

    void instances(){

        //The original method
        UserManagerJava userManager1 = UserManagerJava.getInstance();

        //doesn't work, because of lack of @JvmStatic
        UserManagerKotlin userManager2 = UserManagerKotlin.getInstance();

        //This works, but then you have to change the Java code to fit
        UserManagerKotlinJavaSupport userManager3 = UserManagerKotlinJavaSupport.instanceB;

        //Perfect
        UserManagerKotlinJavaSupport userManager4 = UserManagerKotlinJavaSupport.getInstance();


    }

}
