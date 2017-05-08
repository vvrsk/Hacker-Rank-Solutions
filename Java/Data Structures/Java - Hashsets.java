/*
Java Hashsets

Input Format -

Input Format

In the first line, there will be an integer T denoting number of pairs. Each of the next T lines will contain two strings seperated by a single space.

Output:
Print T lines. In the i-th line, print number of unique pairs you have after taking i-th pair as input.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
		Set<String> hs = new HashSet<>();

		for (int i = 0; i < t; i++) {
           //System.out.println(pair_left[i]+pair_right[i]);
           hs.add(pair_left[i]+" "+pair_right[i]);
           System.out.println(hs.size());
        }
	}