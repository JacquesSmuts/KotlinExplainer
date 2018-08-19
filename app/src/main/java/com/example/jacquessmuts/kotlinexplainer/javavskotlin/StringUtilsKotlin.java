package com.example.jacquessmuts.kotlinexplainer.javavskotlin;

import java.net.URLEncoder;

/**
 * Created by jacquessmuts on 2018/08/18
 * This is an example of a generic utility class contained in most big projects
 */

public class StringUtilsKotlin {

    private static final String LOG_TAG = StringUtilsKotlin.class.getSimpleName();

    /**
     * URL encode a string using UTF-8 character encoding.
     *
     * @param value The string to encode.
     * @return The encoded string on success, or an empty string on failure.
     */
    static public String urlEncodeStringWithUTF8(final String value) {
        String encodedValue = "";
        try {
            encodedValue = URLEncoder.encode(value, "UTF-8");
        } catch (Exception e) {

        }
        return encodedValue;
    }


    public static boolean isNonEmpty(String s) {
        return (s != null) && !s.isEmpty();
    }

    public static boolean isNullOrEmpty(String s) {
        return !isNonEmpty(s);
    }

    /**
     * convert to lowercase with _ (underscore) replacing spaces.
     * @param s
     * @return
     */
    public static String normalize(String s) {
        if (s != null) {
            return s.replaceAll(" ", "_").toLowerCase();
        } else {
            return s;
        }
    }

    public static String[] commaSplit(String input) {
        if (input != null) {
            return input.split(",");
        } else {
            return null;
        }
    }

    public static String nullSafeToLowerCase(String input){
        return !isNullOrEmpty(input) ? input.toLowerCase() : "";
    }
}
