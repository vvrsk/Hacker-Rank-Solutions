/*
Pages Turn
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function
        int pages= p;
        if(n-p > p-1){
                pages = p/2;
            }else {
                if((n-p)>2){
                pages = ((n-p)/2);
                }else{
                    if(n%2 ==0){
                        if(n-p==2){
                            pages = (n-p)/2;    
                        }else{
                            pages = (n-p);
                        }
                    }else{
                        pages = (((n-p)/2));
                    }
                }
        }
        return pages;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
