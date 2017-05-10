/*
Date Conversion
*/


import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Solution {

    public static void main(String[] args)  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer t = new StringTokenizer(s,":");
        int count = 0;
        String [] num = new String[5];
        while(t.hasMoreElements()){
            if(count==0){            
               String strng = t.nextToken().toString();
               int a = Integer.parseInt(strng);
               if(s.contains("A")& a!=12){
                   num[count] = strng;
                         } 
                else if (s.contains("P")& a!=12){
                   num[count] = Integer.toString(a+12);
               }                
                else if (a==12 & s.contains("A")){
                   num[count] = "00";
               } 
                else if (a==12 & s.contains("P")){
                   num[count] = strng;
               }
               num[count+1]=":";
               count++;
            } else if (count == 2){
                count=count+2;
                String st = t.nextToken().toString();
                num[count]= st.substring(0,2);
            
            }else{
                count++;
                num[count] = t.nextToken().toString();
                num[count+1]=":";
                
            }
        }
        
        for(int i=0;i<5;i++){
            
            System.out.print(num[i]);
        }
        
    } }