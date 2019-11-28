package com.kdgboys.HTF.Logic;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class ReverseString {
    private static String reverse(String str){
        StringBuilder result = new StringBuilder(str);
        return result.reverse().toString();
    }
}
