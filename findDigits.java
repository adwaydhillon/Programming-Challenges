/* 
 * Problem Statement
 * You are given a number N. Find the digits in this number that exactly divide N and display their count. 
 * For N = 24, there are 2 digits - 2 & 4. Both these digits exactly divide 24. So our answer is 2.
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class findDigits {
    private static int findDivisibleDigits(int n) {
        int noOfDigits = getNoOfDigits(n);
        int var = 10;
        int count = 0;
        for (int i = 0; i < noOfDigits; i++) {
            if ((n % var) / (var / 10) != 0 && n % ((n % var) / (var / 10)) == 0) {
                count++;
            }
            var *= 10;
        }
        return count;
    }
    
    private static int getNoOfDigits (int n) {
        int noOfDigits = 0;
        for (int i = n ; i > 0; i /= 10) {
            noOfDigits ++;
        }
        return noOfDigits;
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        int n;
        for (int i = 0; i < no; i++) {
            n = in.nextInt();
            System.out.println(findDivisibleDigits(n));
        }
    }
}