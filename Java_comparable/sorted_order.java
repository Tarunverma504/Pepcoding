/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_comparable;

/**
 *
 * @author Mind_Coder
 */
import java.util.*;
class Student_data implements Comparable<Student_data>{  
int rollno;  
String name;  
int age;  
Student_data(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
 @Override 
public int compareTo(Student_data st){  
    if(age==st.age)  
    return 0;  
    else if(age>st.age)  
    return 1;  
    else  
    return -1;  
   }  
}
public class sorted_order {
    public static void main(String args[]){  
        ArrayList<Student_data> al=new ArrayList<Student_data>();  
        al.add(new Student_data(101,"Vijay",23));  
        al.add(new Student_data(106,"Ajay",27));  
        al.add(new Student_data(105,"Jai",21));  

        Collections.sort(al);  
        for(Student_data st:al){  
        System.out.println(st.rollno+" "+st.name+" "+st.age);  
        }  
    }  
}
