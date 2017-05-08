/* Java Deque
In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an 
abstract data type that generalizes a queue, for which elements can be added to or removed from either the 
front (head) or back (tail).
Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque 
classes. For example, deque can be declared as:
Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
You can find more details about Deque here.
In this problem, you are given N integers. You need to find the maximum number of unique integers among 
all the possible contiguous subarrays of size M.
Note: Time limit is 3 second for this problem.
Input Format
The first line of input contains two integers N and M: representing the total number of integers and 
the size of the subarray, respectively. The next line contains N space separated integers.
Constraints
1≤N≤100000
1≤M≤100000
M≤N
The numbers in the array will range between [0,10000000].
Output Format
Print the maximum number of unique integers among all possible contiguous subarrays of size M separated by a space.
Sample Input
6 3
5 3 5 2 3 2
Sample Output
3
*/


/* I implemented this solution in referece to discussion in the forums
Credits  @kailiu  - Hacker Rank 
For keeping the original in place, though I have implemented the code, I am posting @kailiu's code.
*/

import java.util.*;
public class test {
   public static void main(String[] args) {
            
       Scanner in = new Scanner(System.in);
       Deque <Integer> deque = new ArrayDeque<Integer>();
       HashSet<Integer> uniqueSet = new HashSet<Integer>();
       int n = in.nextInt();
       int m = in.nextInt();
       int maxUnique = 0;
       for (int i = 0; i < n; i++) {
           int num = in.nextInt();
           deque.offerLast(num);
           uniqueSet.add(num);      
           if (deque.size()==m) {
        	   maxUnique=Math.max(maxUnique, uniqueSet.size());
        	   if (maxUnique==m){   //don't need to continue if the maximally possible number m of unique elements is reached
        		   break;
        	   } else {
        		   int first = (int) deque.pollFirst();
        		   if (!deque.contains(first)) {		
        			   /*At this stage, deque (e.g. [2,3,4]) has remaining m-1 elements (first is out) and wait for the new element. uniqueSet [1,2,3,4] still has unique elements of old deque (e.g.[1,2,3,4]). At this step, the unique elements in uniqueSet should be synchronized with the remaining deque (e.g.[2,3,4]. If the polled first element (e.g. 1) is not existing in the remaining deque, it should be removed from the uniqueSet. While, if the polled first element has one or more duplicates in the remaining deque, it can stay since...it can represent all its twin brothers, even though one of them doesn't show up because of being polled out.*/
        			      uniqueSet.remove(first);     			   
        		   }
        	   }
           }
           
       }
       System.out.println(maxUnique);
       in.close();
   }
}

/*
My Initial Solution: -> Failed last 3 test cases duw to timeout

import java.util.*;
public class test {
   public static void main(String[] args) {
            
       Scanner in = new Scanner(System.in);
       Deque deque = new ArrayDeque<Integer>();
       int n = in.nextInt();
       int m = in.nextInt();
       int maxUnique = 0;
       for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if(i == 0){
                deque.add(num);  
                maxUnique++;
            }else{
                if(deque.size() == m){
                    deque.removeFirst();
                }
                if(!deque.contains(num) && maxUnique<m){
                    maxUnique++;
                }
                deque.addLast(num);
            }
       }
       System.out.println(""+maxUnique);
    }
}


*/