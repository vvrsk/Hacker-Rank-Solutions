/*
Java Sort

Sorting the objects 
*/

import java.util.*;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code
class ComparatorClass implements Comparator<Object>{
    
     public int compare(Object a, Object b){
        Student s1 = (Student)a;
        Student s2 = (Student)b;
        int i = 0;
       if(s1.getCgpa() > s2.getCgpa()){
               i = -1;
     } else if (s1.getCgpa() == s2.getCgpa()){
               int j = s1.getFname().compareTo(s2.getFname());
               if(j==0){
                   if(s1.getId()>s2.getId()){   // for comparing which string comes first
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
   return i ;
   }
    
}

public class Solution{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
      
       Collections.sort(studentList,new ComparatorClass());
       
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
