/*
Create a Geometric progression Series in Java
*/

import java.util.*;
import java.io.*;
import static java.lang.Math.pow;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = a;
            for (int j=0;j<n;j++){
                s =  s + (int)(pow(2,j)*b);
                System.out.print(s+" ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
