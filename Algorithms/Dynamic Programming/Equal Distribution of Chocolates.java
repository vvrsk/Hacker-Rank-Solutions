/*
Dynamic Programming

Equal

*/

/*
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
/*        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i=0;i<test;i++){
          //Hashset hs = new Hashset();
            for(int j=0;j<n;j++){
               //hs.add(sc.nextInt());
                int temp = sc.nextInt();
                a.add(temp);
            }
            
           int count =0 ;  
           int min = Collections.min(a);
           for(int m=0; m<=5;m++){
           for(int num:a){
              ArrayList<Integer> comp = new ArrayList<Integer>();
              int max = Collections.max(a);
              if(min!=num & !(comp.contains(num))){ 
                   int x = num-min-i;
                   count+=(x)/5 + ((x)%= 5)/2 + ((x)&1);
                   comp.add(num);
                    }
           }
        }
            System.out.println(count);
            }   
          }             
        }    
     // }

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        
        //INPUT
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(byte T = Byte.parseByte(br.readLine()); T > 0; --T){
            final short N = Short.parseShort(br.readLine());
            final short[] A = new short[N];
            String[] input = br.readLine().split(" ");
            for(short i = 0; i < N; ++i){
                A[i] = Short.parseShort(input[i]);
            }
            input = null;
            
            //SOLVE
            if(N < 2){
                sb.append("0\n");
                continue;
            }
            
            int minVal = A[0];
            for(int i = 1; i < N; ++i){
                if (A[i] < minVal){
                    minVal = A[i];
                }
            }
            
            int minCount = Integer.MAX_VALUE;
            for(int i = 0; i <= 5; ++i){
                int count = 0;
                for(short j = 0; j < N; ++j){
                    short V = (short)(A[j] - (minVal - i));
                    count += V/5 + (V %= 5)/2 + (V & 1);
                }
                if (count < minCount){
                    minCount = count;
                }
            }
            
            //OUTPUT
            sb.append(minCount+ "\n");
        }
        System.out.print(sb);
    }
}
