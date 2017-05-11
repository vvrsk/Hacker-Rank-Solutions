/*
Big Sorting
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        
        Arrays.sort(unsorted, new Comparator<String>() {
	    @Override
	    public int compare(String o1, String o2) {
            int ret =0;
		if (o1 == null || o2 == null) {
		    ret=0;
		} else if(o1.length()<o2.length()){
                ret=-1;
            } else if(o1.length()>o2.length()){
                ret=1;
            } else if(o1.length()==o2.length()){
                 ret=o1.compareTo(o2);        
        }
            return ret;  
        } 
	});

        // your code goes here
     StringBuilder output = new StringBuilder("");
     for(String num : unsorted)
         output.append(num+"\n");
     System.out.println(output);

    }
}
