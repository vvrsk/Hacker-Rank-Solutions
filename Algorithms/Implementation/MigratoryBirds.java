/*
Algorithms - Migratory Birds
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
        int[] types = new int[5];
        for(int types_i=0; types_i < n; types_i++){
            int input = in.nextInt();
            types[input-1] = types[input-1]+1;
            //System.out.println("type-"+input+":"+types[input-1]+" Iteration: "+types_i);
        }
        
        int high=types[0];
        int idx =0;
        for(int i =0;i<5;i++){
            if(types[i]>high) {
                high=types[i]; 
                //System.out.println(high+" "+types[i]);
                idx = i;
            }
        }
        
        System.out.println(idx+1);
        
        // your code goes here
    }
}
