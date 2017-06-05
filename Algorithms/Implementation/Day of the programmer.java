/*
Day of the Programmer
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
    static String finalYear(int year,boolean isLeap){
        String returnString= "None";
        if (isLeap)
         {
            returnString="12.09."+year;
        }else if (!isLeap& year!=1918) {
            returnString="13.09."+year;
        }else if(year == 1918){
            returnString="26.09."+year;
    } 
        return returnString;
    }

    static String solve(int year){
        // Complete this function
        boolean isLeap = false;
        String returnString = "Nada";
            if(year%400==0 || ((year%4== 0) && (year % 100 != 0))|| (year==1700) || (year==1800) || (year==1900)){
                isLeap = true;
               returnString = finalYear(year,isLeap);
            }else{
                isLeap = false;
               returnString = finalYear(year,isLeap);
            }
       return returnString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
