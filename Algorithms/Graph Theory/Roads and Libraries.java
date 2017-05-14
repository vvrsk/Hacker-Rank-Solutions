/*
Roads and Libraries

Algorithms Roads and Libraries - This was solved in reference to the discussions in the Hacker Rank. Thanks to @i_siddhant and @mohamedrefat007


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long connectedComponents;
    static boolean[] isVisited;
    static ArrayList<Integer>[] adjCities;
            
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        
        for(int a0 = 0; a0 < q; a0++){
            //HashMap hm = new HashMap();
            
            int cities = in.nextInt();
            int roads = in.nextInt();
            int clib = in.nextInt();
            int croad = in.nextInt();
            adjCities = (ArrayList<Integer>[]) new ArrayList[cities+1];
            //Corner Case of low library cost
            // No roads.
            if(croad>clib||roads ==0){
                
                long out = (long) clib * cities;
                System.out.println(out);
                for (int i = 0; i < (roads*2); i++){
                    in.nextInt();
                }
                continue;
             }
            else{
                adjCities = (ArrayList<Integer>[])new ArrayList[cities+1];
                //Initializing all the elements of the Array
                for (int c = 0; c <= cities; c++){
                    adjCities[c] = new ArrayList<Integer>();
                }
                isVisited = new boolean[cities+1];
                
                for(int a1 = 0; a1 < roads; a1++){
                    int city_1 = in.nextInt();
                    int city_2 = in.nextInt();
                    //Adding a 2-way/ bi directional road between cities
                    adjCities[city_1].add(city_2);
                    adjCities[city_2].add(city_1);
                }
                
                for(int c = 1; c <= cities; c++) {
                    if(!isVisited[c]) {
                        dfs(c);
                        connectedComponents++;
                    }
                }
                
                long out = (long) croad * (cities - connectedComponents) + clib * connectedComponents;
                System.out.println(out);
                connectedComponents = 0;
               // isVisited = new boolean[cities];
               // adjCities = (ArrayList<Integer>[]) new ArrayList[cities+1];
                isVisited = new boolean[10000];
                adjCities = (ArrayList<Integer>[]) new ArrayList[10000+1];
                
          }
        }
    }
    
    private static void dfs(int city){
        isVisited[city] = true;
          for (int c = 0; c < adjCities[city].size(); c++){
            if(!isVisited[adjCities[city].get(c)]){
                dfs(adjCities[city].get(c));
            }
        }
    }
    
    
    
    
}
