/*
Java - List

For this problem, we have  types of queries you can perform on a List:

Insert Y at X index :

Insert
x y
Delete the element at index X :

Delete
x

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
        List<Integer> list = new ArrayList();
        
        for(int i=0;i<n;i++){
            
            list.add(sc.nextInt());
        }
        
       int iter = sc.nextInt();
        for (int i=0; i<iter;i++){
          String action = sc.next();
          int index = sc.nextInt();
          switch(action){
            case "Insert":
                            
                            int value = sc.nextInt();
                            list.add(index,value);
                            break;
            case "Delete":
                            list.remove(index);
                            break;
            default : // Optional
                        System.out.println("Enter proper input");
             break;
        }        
    }
    
    //Print output 
    for (int item:list){
        System.out.print(item+" ");
    }
    }
}
