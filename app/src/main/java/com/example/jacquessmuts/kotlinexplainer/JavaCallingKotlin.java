package com.example.jacquessmuts.kotlinexplainer;

import com.example.jacquessmuts.kotlinexplainer.javavskotlin.StringUtilsJava;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.StringUtilsKotlin;

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

    }

}
