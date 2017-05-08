/*
Java Subarray
Input Format

The first line contains a single integer,n , denoting the length of array A . 
The second line contains  space-separated integers describing each respective element, a , in array A.


*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        int count=0,sum=0;
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
       for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum < 0) {
                    count++;
                }
            }
            sum = 0;
        }
        System.out.println(count);
    }
}