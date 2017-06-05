/*
Bon Apetit
*/
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        double[] arr = new double[n];
        int i =0;
        while (i<n){
            arr[i] = sc.nextDouble();
            // System.out.println("arr[i]"+arr[i]);
            i++;
           
        }
        double charged = sc.nextDouble();
        //System.out.println(charged);
        double sum = DoubleStream.of(arr).sum();
        double sumActual = sum - arr[k];
        //System.out.println(sumActual);
        
        if(sumActual/2 == charged){
            System.out.println("Bon Appetit");
        }else{
            System.out.println((int)(charged-(sumActual/2)));
        }
        
        
    }
}