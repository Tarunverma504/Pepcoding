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
class Reverse_Student implements Comparable<Reverse_Student>{    
 int rollno;    
 String name;    
 int age;    
 Reverse_Student(int rollno,String name,int age){    
 this.rollno=rollno;    
 this.name=name;    
 this.age=age;    
 }    
     
 public int compareTo(Reverse_Student st){    
 if(age==st.age)    
 return 0;    
 else if(age<st.age)    
 return 1;    
 else    
 return -1;    
 }    
 }    
public class reverse_order {
    public static void main(String args[]){    
        ArrayList<Reverse_Student> al=new ArrayList<Reverse_Student>();    
        al.add(new Reverse_Student(101,"Vijay",23));    
        al.add(new Reverse_Student(106,"Ajay",27));    
        al.add(new Reverse_Student(105,"Jai",21));    

        Collections.sort(al);    
        for(Reverse_Student st:al){    
        System.out.println(st.rollno+" "+st.name+" "+st.age);    
        }    
    }    
}
