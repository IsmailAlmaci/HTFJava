package com.kdgboys.HTF.Logic;
import java.util.Arrays;

public class morseCode {

    private static String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", "!", ",", "?", ".", "'"};
    private static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "-.-.--", "--..--", "..--..", ".-.-.-", ".----.",};

    private static String decode(String morseCode) {
        String build = "";
        String change = morseCode.trim();
        String[] words = change.split("   ");
        for (String word : words) {
            for (String letter : word.split(" ")) {
                for (int x = 0; x < morse.length; x++) {
                    if (letter.equals(morse[x]))
                        build = build + alpha[x];
                }
            }
            build += " ";
        }

        return build.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(decode("-. ... - .--- ..-. -..- --.- -.. .-- -.."));
    }
}