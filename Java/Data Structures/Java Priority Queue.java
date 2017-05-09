/*
Java Priority Queue  - Spoiler Alert. I didnt do it with priority Queue

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

class ComparatorClass implements Comparator<Object>{
     
     public int compare(Object a, Object b){
        //System.out.println("Here");
        Student s1 = (Student)a;
        Student s2 = (Student)b;
        int i = 0;
       if(s1.getCgpa() > s2.getCgpa()){
               i = -1;
     } else if (s1.getCgpa() == s2.getCgpa()){
               int j = s1.getFname().compareTo(s2.getFname());
               if(j==0){
                   if(s1.getToken()>s2.getToken()){   // for comparing which string comes first
                       i= 1; 
                   } else {
                       i= -1;
                   }
               } else if (j>0) {
                   i = 1; 
               } else if ( j<0){
                   i = -1;
               }   
       }   else if (s1.getCgpa() < s2.getCgpa()){
           
           i = 1;
       }
   //System.out.println(s1.getFname()+" "+s2.getFname()+"-"+i);
   return i ;
   }
    
}


public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      List<Student> studentList = new ArrayList<Student>();
	  Student st;
        //System.out.println(totalEvents);
	  while(totalEvents>0){
		 String event = in.next();
		   //System.out.println(totalEvents+" "+event);
           //Complete your code
          switch(event) {
              case "ENTER": 
					 String fname = in.next();
					 double cgpa = in.nextDouble();
					 int id = in.nextInt();
                     //System.out.println(fname+" "+cgpa+" "+id);
					 st = new Student(id, fname, cgpa);
					 studentList.add(st);
					 Collections.sort(studentList,new ComparatorClass());
              break;
              case "SERVED": 
                     try{
                         if(studentList.isEmpty()){
				             totalEvents--;
                             continue;
                         }
			             else{
					        studentList.remove(0);
                                }
                     }catch (Exception e){
                            System.out.println(e.getMessage());
                     } 
              break;
          }
           
         totalEvents--;
      }
	  if(studentList.isEmpty()){
		System.out.println("EMPTY");
	  }else{
	  for(Student s:studentList){
				System.out.println(s.getFname());
	  }
    }
 }
}