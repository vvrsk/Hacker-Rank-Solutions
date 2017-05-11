/*
The Hurdle Race - https://www.hackerrank.com/challenges/the-hurdle-race
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        // your code goes here
        
        Arrays.sort(height);
        int hmax = height[height.length-1];
        int bev = hmax-k;
        if(bev>0){
            System.out.println(bev);
        } else{
            System.out.println(0);
        }
        
    }
}
