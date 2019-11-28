package com.kdgboys.HTF.Logic;

//TODO test
public class FindMagicNumber {
    static int getResult(int n)
    {
        int pow = 1, answer = 0;

        while (n != 0)
        {
            pow = pow*5;
            if ((int)(n & 1) == 1)
                answer += pow;
            n >>= 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(getResult(3));
    }
}
