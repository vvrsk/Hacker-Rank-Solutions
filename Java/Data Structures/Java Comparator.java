/*
Java Comparators
Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.

Given an array of n  Player objects, write a comparator that sorts them in order of decreasing score; if 2 or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.

Input Format

Input Format

Input from stdin is handled by the locked stub code in the Solution class.

The first line contains an integer, n, denoting the number of players. 
Each of the n subsequent lines contains a player's  name and score, respectively.

Output

You are not responsible for printing any output to stdout. The locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.
*/

import java.util.*;
// Write your Checker class here

class Checker implements Comparator<Object> {
    
   public int compare(Object a, Object b){
        Player p1 = (Player)a;
        Player p2 = (Player)b;
        int i = 0;
       if(p1.name.equals(p2.name)){
               if(p2.score == p1.score){
                   i = 0;
               } else if (p1.score > p2.score) {
                   i = -1; // Because it is descending order, giving it -1 Actually it should be 1
               } else if ( p1.score<p2.score){
                   i = 1;
               }
     } else {
               if(p2.score == p1.score){
                   if(p1.name.compareTo(p2.name) <0){   // for comparing which string comes first
                       i= -1; 
                   } else {
                       i= 1;
                   }
               } else if (p1.score > p2.score) {
                   i = -1;  // Because it is descending order, giving it -1 Actually it should be 1
               } else if ( p1.score<p2.score){
                   i = 1;
               }
           
       }   
   return i ;
   }
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}