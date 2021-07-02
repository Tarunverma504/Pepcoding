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
You have to search an element at a given position in a list. For that You have been given lines. In each line there are zero
or more integers. You need to answer a query where you need to tell the number located in position of line.
scan
1)no of lists2)number of element in list,3)list number4)position
*/
import java.util.*;
class AddList{
    ArrayList<ArrayList> l=new ArrayList<ArrayList>();
    public void AddItem(ArrayList<Integer> al){
        l.add(al);
    }
    public Integer display(Integer num,Integer x){
        for(int i=0;i<l.get(num).size();i++){
            if(x==l.get(num).get(i)){return i;}
        }
        return -1;
    }
  
}
public class q3 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        AddList obj1=new AddList();
        System.out.println("Enter Number of list:-");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter Size of list"+i+":- ");
            int x=sc.nextInt();
            System.out.println("Enter Elements of list"+i+":- ");
            ArrayList<Integer> al=new ArrayList<Integer>();
            for(int j=0;j<x;j++){
               Integer value=sc.nextInt();
               al.add(value);
            }
            obj1.AddItem(al);
        }
        System.out.print("Enter List Number For Searching:-");
        Integer num=sc.nextInt();
        System.out.print("Enter Searching Element:-");
        Integer x=sc.nextInt();
        Integer result=obj1.display(num-1,x);
        if(result!=-1){
            System.out.println("Element found at position"+result+" of list "+num);
        }else{
            System.out.println("Result not found");
        }
    }
    
}