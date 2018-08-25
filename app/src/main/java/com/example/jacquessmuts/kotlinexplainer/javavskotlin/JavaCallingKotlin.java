package com.example.jacquessmuts.kotlinexplainer.javavskotlin;

import com.example.jacquessmuts.kotlinexplainer.javavskotlin.java.StringUtils;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.java.User;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.java.UserManager;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlin.StringUtilsk;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlin.UserManagerk;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlin.Userk;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlinwithjavasupport.UserManagerjk;
import com.example.jacquessmuts.kotlinexplainer.javavskotlin.kotlinwithjavasupport.Userjk;

/**
 * Created by jacquessmuts on 2018/08/19
 * This is a Java class which calls Kotlin classes to see if the conversion is done
 */
public class JavaCallingKotlin {

    void callingStringUtils(){

        //this is the original
        String normalizedJava = StringUtils.normalize("Hello_There");

        //This doesn't work, because normalize has not been exposed as a static yet
        String normalizedKotlin = StringUtilsk.normalize("Hello_There");

        //this is the original
        String[] splitJava = StringUtils.commaSplit("Hello, sir");

        //this works because commaSplit has been annotated with @JvmStatic
        String[] splitKotlin = StringUtilsk.commaSplit("Hello, sir");
    }

    void callingFields(){

        User user = new User(1);
        String usernameJava = user.username; //it's a public variable

        //doesn't work
        Userk userKotlin = new Userk(1);

        //works, because [@JvmOverloads constructor] has been added
        Userjk userKotlinWithJavaSupport = new Userjk(1);

        String usernameKotlin = userKotlin.username; //doesn't work

        String usernameKotlin2 = userKotlinWithJavaSupport.username; //works, because [@JvmField]

    }

    void instances(){

        //The original method
        UserManager userManager1 = UserManager.getInstance();

        //doesn't work, because of lack of @JvmStatic
        UserManagerk userManager2 = UserManagerk.getInstance();

        //This work, but then you have to change the Java code to fit
        UserManagerk userManager3 = UserManagerk.Companion.getInstance();

        //Perfect
        UserManagerjk userManager4 = UserManagerjk.getInstance();

    }

}
