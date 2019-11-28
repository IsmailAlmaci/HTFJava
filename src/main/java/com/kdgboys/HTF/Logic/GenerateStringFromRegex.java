package com.kdgboys.HTF.Logic;

import com.mifmif.common.regex.Generex;

public class GenerateStringFromRegex {

    public static String getResult(String str){
        Generex generex = new Generex(str);
         return generex.getMatchedString(1);
    }
}

