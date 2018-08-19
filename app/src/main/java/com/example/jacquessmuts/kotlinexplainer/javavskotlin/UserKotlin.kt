package com.example.jacquessmuts.kotlinexplainer.javavskotlin

/**
 * Created by jacquessmuts on 2018/02/15.
 * converted to kotlin in revision 6d989692a6a2fe3331f47a690c3cb84ff8c7e767
 */

class UserKotlin(var id: Long,
                 var username: String? = "Hello There",
                 var password: String? = "General Kenobi",
                 var type: Type? = Type.GOLDFISH) {

    enum class Type {
        WHALE, DOLPHIN, GOLDFISH
    }
}
