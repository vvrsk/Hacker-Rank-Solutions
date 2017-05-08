/*
Java Dynamic Array
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
        int n = sc.nextInt();
        int[][] a = new int[n][];
        for (int i=0; i<n;i++){
            int nline = sc.nextInt();
             a[i] = new int[nline];
            for(int j =0 ; j<nline; j++){
                a[i][j] = sc.nextInt();
               // System.out.print(i+","+j+","+a[i][j]+" ");
            } 
           // System.out.print("\n");
        }
        
        int nop = sc.nextInt();
        
        for(int i=0;i<nop;i++){
          int row = sc.nextInt();
          int col = sc.nextInt();
          try{
                 
                  System.out.println(a[row-1][col-1]);
    
             }
            catch(Exception e)
                {
                System.out.println("ERROR!");
            }
        }
        
    }
}