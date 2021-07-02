/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author Mind_Coder
 */
/*
here is a Department of the college which needs some details of students information: RollNo, FirstName, and Student
CGPA. So rst take students details from user then arrange the list of students according to their CGPA in decreasing
order. For example If two student have the same CGPA, then arrange them according to their rst name in alphabetical
order. If there are also students with same name, then order them according to their RollNo(ID). Every students should
have the unique RollNo(ID). CGPA should be less then equal to 5
Approach : Enter the rst line of input which contains an integer, representing the total number of students. Then
next lines will contain a details of a student information in same line given in the following structure:
Input Format
RollNo FirstName StudentCGPA
*/

import java.util.*;
class Students_Data implements Comparable<Students_Data>{
    int rollNo;
    String Name;
    double cgpa;
    public Students_Data(int rollNo,String Name,double cgpa){
        this.Name=Name;
        this.rollNo=rollNo;
        this.cgpa=cgpa;
    }
    public int compareTo(Students_Data s1){
        if(this.cgpa<s1.cgpa){
            return 1;
        }
        else if(this.cgpa>s1.cgpa){
            return -1;
        }else{
            return this.Name.compareTo(s1.Name);
        }
    }
    public String getName(){
        return this.Name;
    }

}
public class q4 {
    public static void main(String[] arg){
        ArrayList<Students_Data> al=new ArrayList<Students_Data>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
          int rollNo=sc.nextInt();
          sc.nextLine();
          String Name=sc.nextLine();
          double cgpa=sc.nextDouble();
          al.add(new Students_Data(rollNo,Name,cgpa));
        }
        Collections.sort(al);
        for(Students_Data p:al)
        System.out.println(p.getName());
    }
}
