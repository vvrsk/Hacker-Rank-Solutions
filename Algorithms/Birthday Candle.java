/*
Birthday Candle
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
        int height[] = new int[n];
        int count=0;
        
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        Arrays.sort(height);
        
  /*      for(int i=n-1;i>0;--i){
          if(height[n-1]== height[0]){
           count = n;   
              break;
          }else if(height[i]==height[i-1]){
           count++;
          }
       }
        System.out.print(count); 
        */
        
        for(int i=0;i<n;i++){
            if(height[n-1]==height[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
