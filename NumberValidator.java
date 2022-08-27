package com.jap.wrapper;
import java.lang.NumberFormatException;
public class NumberValidator {

    public int validateNumber(String input) {
        int len = input.length();
        int k = 10, total = 0, res = 1;
        int output=1;
        if (len == 0)
        {
            output=-1;
        }
        else if (len != 0)
        {
            for (int i = 0; i < len; i++) {
                char ch = input.charAt(i);
                if (ch >= 48 && ch <= 57) {
                    int digit=ch-'0';
                    total = total + (k * digit);
                    k=k-1;
                } else {
                    throw new NumberFormatException();
                }
            }
            res = total % 11;
            if (res == 0)
                output=1;
            else
                output=0;
        }
        else
        {
            output=0;
        }
        return output;
    }
}
