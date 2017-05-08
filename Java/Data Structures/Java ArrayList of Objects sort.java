/*

JAva ArrayLis of objects Sorting


You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.

Input Format

The first line of input contains an integer N, representing the total number of students. The next N lines contains a list of student information in the following structure:

ID Name CGPA

Output Format

After rearranging the students according to the above rules, print the first name of each student on a separate line.

Sample Input

5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76

Sample Output

Ashis
Fahim
Samara
Samiha
Rumpa
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
                   i = 1;  // Because it is descending order, giving it -1 Actually it should be 1
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
