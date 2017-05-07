/*
JAva String Tokens

Given a string, s , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        StringTokenizer st = new StringTokenizer(s,",'!_@.? ");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
           System.out.println(st.nextToken());
        }
    }
}
