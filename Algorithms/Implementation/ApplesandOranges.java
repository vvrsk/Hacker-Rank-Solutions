/*
Algorithms- Apples and Oranges -https://www.hackerrank.com/challenges/apple-and-orange

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
     long countApple = Arrays.stream(apple)
    .filter(x -> x + a  >= s && x + a <= t)
    .count();

     long countOrange =Arrays.stream(orange)
    .filter(x -> x + b  >= s && x + b <= t)
    .count();
      
        System.out.println(countApple);
        System.out.println(countOrange);        
    }
}
