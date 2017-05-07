/*Given a string, find out the lexicographically smallest and largest substring of length k.

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format

First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line will consist an integer k.

Output Format

In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String high = "";
        String low  = "";
         String [] a[];
        String input = sc.nextLine();
        int num = sc.nextInt();
        
        if(input.length() == num){
            System.out.println(input);
            System.out.println(input);
        }
        else{
        for(int i =0 ; i<= input.length()-num ; i++)
            {
           String subString = input.substring(i,i+num);
           if(i == 0){
                low = subString;
            }
           if(subString.compareTo(high)>0){
                high = subString;
            }else if(subString.compareTo(low)<0){
                low = subString;
           }
        }     
       }
        System.out.println(low);
        System.out.println(high);
    }
  }