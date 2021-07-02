/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Comparator;

/**
 *
 * @author Mind_Coder
 */
import java.util.*;
class Student{
    int rollNo;
    String name;
    int age;
    public Student(int rollNo,String name,int age){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
    }
}
class NameComparator implements Comparator<Student>{ 
    @Override
    public int compare(Student o1,Student o2){  
    Student s1=(Student)o1;  
    Student s2=(Student)o2;  

    return s1.name.compareTo(s2.name);  
    }  
}  
class Agecomparator implements Comparator<Student>{
    @Override
    public int compare(Student o1,Student o2){
        Student s1=(Student)o1;  
        Student s2=(Student)o2;
        if(s1.age==s2.age) return 0;
        else if(s1.age>s2.age) return 1;
        else return -1;
    }
}


public class Example1 {
    public static void main(String[] arg){
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(0504,"Tarun Verma",19));
        al.add(new Student(502,"Vishesh",20));
        al.add(new Student(498,"Om",18));
        al.add(new Student(495,"Rahul",19));
        al.add(new Student(510,"Shivam",17));
        System.out.println("Sorting By Name");
        Collections.sort(al,new NameComparator());
        for(Student st:al){
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }
        System.out.println("Sorting By Age");
        Collections.sort(al,new Agecomparator());
        for(Student st:al){
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }
    }
}
