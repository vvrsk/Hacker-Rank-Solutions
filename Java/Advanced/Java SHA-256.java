/*
Java SHA 256
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        try{
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        Scanner sc = new Scanner(System.in);
        
        md.update(sc.nextLine().getBytes());
        //Getting the byte array
		byte[] digest = md.digest();
        
        
        StringBuffer sb = new StringBuffer();
        //Converting to Hexadecimal
		for (int i = 0; i < digest.length; i++) {
          sb.append(Integer.toString((digest[i] & 0xff) + 0x100, 16).substring(1));
        }
        
        System.out.println(sb.toString());

        
        //String myHash = DatatypeConverter.printHexBinary(digest);
        //System.out.println(myHash);
        }
        catch(Exception e){
        
        System.out.println(e);
    }
    }
}