/*
Birthday chocolate
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getWays(int[] squares, int d, int m){
        // Complete this function
        int count=0;
        if(squares.length == 1){
                count = 1;
            }
        else{
             for(int a=0; a<squares.length-m+1;a++){
                    int sum=0;
                    for(int i=a;i<a+m;i++){
                        sum+=squares[i];
                       // System.out.println(sum);
                    }
                  //  System.out.println(sum+" "+d);
                    if(sum == d){
                      // System.out.println(sum);
                       count++;   
                    }
                    } 
        }
       return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
