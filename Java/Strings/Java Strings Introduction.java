/*
This exercise is to test your understanding of Java Strings. 
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        String str1 = A.substring(0,1).toUpperCase()+A.substring(1);
        String str2 = B.substring(0,1).toUpperCase()+B.substring(1);
        
        
        System.out.println (A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(str1+" "+str2);
            
        
    }
}
