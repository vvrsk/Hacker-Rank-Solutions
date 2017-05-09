/*
JAva - MD5

MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function with a 128-bit hash value. Here are some common uses for MD5:

To store a one-way hash of a password.
To provide some assurance that a transferred file has arrived intact.


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
        MessageDigest md = MessageDigest.getInstance("MD5");
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