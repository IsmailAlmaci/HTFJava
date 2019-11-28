package com.kdgboys.HTF.Logic;

public class PlatinumLogic {
    public void ceasarShiftCipher(CharSequence input) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= 25; i++) {
            output.append(checkAsciiNumber((int)input.charAt(i)+i));
            System.out.println(output);
            output = new StringBuilder();
        }
    }

    //handles asciiCodes that are out of range
    private char checkAsciiNumber (int asciiCode){
        if(asciiCode > 122){
            return (char)(asciiCode - 25);
        } else if (asciiCode < 97){
            return (char)(asciiCode + 25);
        } else
            return (char)asciiCode;
    }
}
