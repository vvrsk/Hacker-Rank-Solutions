/*
Algorithms - Diagonal difference
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][n];
        int sum =0;
        for(int i =0; i<n; i++){
            for(int j=0; j<n;j++){
                 a[i][j]= sc.nextInt();
            }
            sum=sum+(a[i][i]-a[i][n-i-1]);
        }
        
        System.out.println(Math.abs(sum));
      
    }
}