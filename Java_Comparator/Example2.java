/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mind_Coder
 */
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
class Students{
    int rollNo;
    String name;
    int age;
    public Students(int rollNo,String name,int age){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
    }
}
class Name_Comparator implements Comparator{ 
    @Override
    public int compare(Object o1,Object o2){  
    Students s1=(Students)o1;  
    Students s2=(Students)o2;  

    return s1.name.compareTo(s2.name);  
    }  
}  
class Age_Comparator implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        Students s1=(Students)o1;  
        Students s2=(Students)o2;
        if(s1.age==s2.age) return 0;
        else if(s1.age>s2.age) return 1;
        else return -1;
    }
}


public class Example2 {
    public static void main(String[] arg){
        ArrayList<Students> al=new ArrayList<Students>();
        al.add(new Students(0504,"Tarun Verma",19));
        al.add(new Students(502,"Vishesh",20));
        al.add(new Students(498,"Om",18));
        al.add(new Students(495,"Rahul",19));
        al.add(new Students(510,"Shivam",17));
        System.out.println("Sorting By Name");
        Collections.sort(al,new Name_Comparator());
        for(Students st:al){
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }
        System.out.println("Sorting By Age");
        Collections.sort(al,new Age_Comparator());
        for(Students st:al){
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }
    }
}

