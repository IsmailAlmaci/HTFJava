package com.kdgboys.HTF.Logic;

import com.mifmif.common.regex.Generex;

public class generateStringFromRegex {

    private static String getResult(String str){
        Generex generex = new Generex(str);
         return generex.getMatchedString(1);//generex.getAllMatchedStrings();
    }

    public static void main(String[] args) {
        System.out.println(getResult("[0-3]([a-c]|[e-g]{1,2})"));
    }
}

