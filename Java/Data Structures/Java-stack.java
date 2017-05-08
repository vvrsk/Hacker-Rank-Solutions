/*
Java - Stack

In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added.(Wikipedia)
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.


*/


import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
     Stack<Character> st  = new Stack<Character>();
     while (sc.hasNext()) {
         String input=sc.next();
         
		 st.push(input);
      }
     
       if(st.size() %2 !=0 || st.size()==0){
           return false; 
        } else {
          int i =st.size();
          while(i>=0 && !st.empty()){
             char elem = st.get(i);
              switch(elem){
                 case '}': if (st.peek() == '{') {
                              st.pop();
                            } break;
                 case ']': if (st.peek() == '[') {
                            st.pop();
                            } break;
                 case ')': if (st.peek() == '(') {
                            st.pop();
                            } break;
                  default: System.out.println("Input undefined in the code!");                  
              }
             i--;
          }   
      }
     if(st.empty())
         System.out.println("true");
       else
         System.out.println("false");  
       
   }     
}  