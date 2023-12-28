/*4
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author prati
 */
public class UseEmp {
    
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
         List<Emp> empList=new ArrayList<>();
         Emp e1=new Emp(10,"Abhay",90000.0);
         Emp e2=new Emp(30,"Pinkey",55000.0);
         Emp e3=new Emp(35,"Ashok",60000.0);
         Emp e4=new Emp(8,"Sanjana",350000.0);
         Emp e5=new Emp(35,"Aashish",7800.0);
         
         empList.add(e1);
         empList.add(e2);
         empList.add(e3);
         empList.add(e4);
         empList.add(e5);
         System.out.println("Before Sorting");
         for(Emp e: empList){
            
             System.out.println(e);
         }
//         System.out.println("Enter age,name & salary to remove the employee");
//         int age=kb.nextInt();
//         String name=kb.next();
//         double sal=kb.nextDouble();
//         
//         Emp x=new Emp(age,name,sal);
//         boolean result=empList.remove(x);
//         
//         if(result){
//             System.out.println("Emoloyee removed ");
//         }
//         else
//             System.out.println("Employee not found:");

        
        Collections.sort(empList);
         System.out.println("After Sorting:");
         for(Emp e: empList){
            
             System.out.println(e);
         }
         
    }
    
}
