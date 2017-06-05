/*
Sea Level
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c ;
        c= sc.next();
       
        int level =0;
        int valley =0;
        boolean belowSea = false;
        for (int i=0; i<n;i++){
            if(c.charAt(i)== 'U'){
                level+=1;
            }else if (c.charAt(i)== 'D'){
                level-=1;
        }
            if(!belowSea & level< 0){
                valley+=1;
                belowSea =true;
            }
            
            if(level >= 0)//We are back above sea level
                belowSea = false;
        }
        
        System.out.println(valley);
        }
        
    }
