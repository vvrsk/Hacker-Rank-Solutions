/*
Number inbetween Sets
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
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        int low = a[n-1];
        int high = b[0];
        int countA=0;
        
        for(int i = low; i<= high;i++){
          //  System.out.println(i);
        boolean breakvar = true;
        boolean breakvar2 =  true;
             for(int j=0; j<a.length;j++){
                  if(!(i%a[j]==0)){
                      breakvar = false;
                      //countA--;
                      break;                    
                  } else{
             for(int k=0; k<b.length;k++){
                  if(!(b[k]%i==0)){
                      breakvar2 = false;
                      //countA--;
                      break;             
                  }               
              }       
        }
   }
            if((breakvar&breakvar2)){
          
               countA++;
            } 
 }
System.out.println(countA);
    }
}

