/*
Java Exception handling

Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or exceptional conditions requiring special processing – often changing the normal flow of program execution. (Wikipedia)

Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.

Sample Input 0:

10
3
Sample Output 0:

3
Sample Input 1:

10
Hello
Sample Output 1:

java.util.InputMismatchException
Sample Input 2:

10
0
Sample Output 2:

java.lang.ArithmeticException: / by zero
Sample Input 3:

23.323
0
Sample Output 3:

java.util.InputMismatchException
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
        try{
            int numr = sc.nextInt();
            int denom = sc.nextInt();
            int result = numr/denom;
            System.out.println(result);
        } 
        catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        } 
        catch(Exception e){
             System.out.println(e);
        }
    }
}