package com.example.jacquessmuts.kotlinexplainer

import android.widget.RelativeLayout.LayoutParams as RelativeLayoutParams
import android.widget.LinearLayout.LayoutParams as LinearLayoutParams //import renaming

/**
 * Created by jacquessmuts on 2018/02/15.
 */

class BasicKotlinExamples {

    //Ranges
    val aToZ = "a".."z"
    val overNineThousand = 1..9001
    val oddNumbers = overNineThousand.step(2).reversed()

    val isTrue = "c" in aToZ




}