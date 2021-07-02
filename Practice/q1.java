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
Varq Accent private limited is organizing an online recruitment test all over India. Students of Final year and pre-final year
of any deemed university can register online on ofcial website of Varq Accent "VarqAccent.com". After registration each
student would be provided a registration number and seat allotted in seating plan.There are limited seats. Seat would be
allotted according to the ascending order of registration. Develop a System to take name, Batch(year of admission in
Bachelor degree) & registration number as input, provide seat number to all students after checking if student is eligible
for test (pre-nal i.e. 2016 batch & nal year i.e. 2015 batch students can appear for exam) and display seating plan
accordingly.

*/
import java.util.*;
class Varq implements Comparable<Varq>{
    Integer batch,reg;
    String name;
    static int seat=0;
    public Varq(Integer batch,String name,Integer reg){
        this.batch=batch;
        this.name=name;
        this.reg=reg;
    }
    public int compareTo(Varq b){
        if(b.reg<this.reg)
        return 1;
        else
        return -1;
    }
    @Override
    public String toString(){
        if(this.batch>=2015){
        seat++;
            return "seat no.:"+seat+" registration number:"+this.reg+" name:"+this.name;
        }
        else{
            return "registration number:"+this.reg+" name:"+this.name+" sorry not eligible";
        }
    }

}
public class q1 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n;
        String b;
        ArrayList<Varq>l=new ArrayList<Varq>();
        System.out.print("Enter the number of students:");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
          System.out.print("Enter batch:");
          Integer a=sc.nextInt();
          sc.nextLine();
          System.out.print("Enter name:");
          b=sc.nextLine();
          System.out.print("Enter registration number:");
          Integer c=sc.nextInt();
          l.add(new Varq(a,b,c));
        }
        Collections.sort(l);
        for(Varq str:l)
          System.out.println(str);
        }
}
