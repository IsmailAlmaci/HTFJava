package com.kdgboys.HTF.Logic;

import java.util.ArrayList;

public class SelectMethod {
    public static ArrayList<String> selectMethod(ArrayList<String> challenges, String challengeParam)
    {
        ArrayList<String> answer = new ArrayList<>();
        for (String challenge : challenges)
        {
            switch(challenge) {
                case "Decode the following string":
                    answer.add(morseCode.decode(challengeParam));
                case "Reverse the following String":
                    answer.add(reverseString.reverse(challengeParam));
                case "Provide a string that matches the regex":
                    answer.add(generateStringFromRegex.getResult(challengeParam));
                    default:
                        answer.add("wrong answer");
            }
        }
        return answer;
    }
}
