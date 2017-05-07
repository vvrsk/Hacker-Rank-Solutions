/*
Tag Content Extractor

In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.

Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.

Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.

Tags can consist of any printable characters.

Input Format

The first line of input contains a single integer,N  (the number of lines). 
The N subsequent lines each contain a line of text.

Constraints

1<N<100

Each line contains a maximum of 10000 printable characters.
The total number of characters in all test cases will not exceed 1000000.
Output Format

For each line, print the content enclosed within valid tags. 
If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print None.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor{
   
   public static void main(String[] args){
   	
       Scanner in = new Scanner(System.in);
       int testCases = Integer.parseInt(in.nextLine());
       String regexPatern = "(<[^>]*>)";
       Pattern stringPatern  = Pattern.compile(regexPatern);
       while(testCases>0){
      		String line = in.nextLine();
          	int pos = 0;
          	Matcher m = stringPatern.matcher(line);
          	String previousHTMLTag = null;
          	int previousTagPos = -1;
          	boolean didFind = false;
          	while(m.find())
          	{	
              	String htmlTag = line.substring(m.start(),m.end());
              	if(htmlTag.charAt(1) != '/')
              	{
	            	previousHTMLTag = htmlTag;
	               	previousTagPos = m.end();
              	}else if(htmlTag.charAt(1) == '/' && previousHTMLTag != null){
                  	if(previousHTMLTag.substring(1).equals(htmlTag.substring(2))&&previousHTMLTag.length()>2 && m.start()>previousTagPos+1){
                    	System.out.println(line.substring(previousTagPos,m.start()));
                      	didFind = true;
                  	}
                	previousHTMLTag = null;
              	}
                  
          	}
          	System.out.print(didFind?"":"None\n");
          	testCases--;
        }
          
    }
}