package com.kdgboys.HTF.Logic;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class reverseString {
    public static String reverse(String str){
        StringBuilder result = new StringBuilder(str);
        return result.reverse().toString();
    }
}
