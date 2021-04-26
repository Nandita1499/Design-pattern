/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nandita
 */
import java.util.*;
public class MyCalc2 
{
        public static void main(String s[])
        {
            double no1,no2,ans;
            int ch;
            Scanner sc=new Scanner(System.in);   
            Addition add=new Addition();
            Subtraction sub=new Subtraction();
            Multiplication mul=new Multiplication();
            Division div=new Division();
            
            System.out.print("Enter the first number:-");
            no1=sc.nextDouble();
            System.out.print("Enter the second number:-");
            no2=sc.nextDouble();
            
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.print("Enter your choice:-");

            ch=sc.nextInt();
            if(ch==1)
            {
                add.setNo1(no1);
                add.setNo2(no2);
                ans=add.getSum();
                System.out.print("Sum of"+ add.getNo1()+"+"+add.getNo2()+"="+ans);
            }
            else if(ch==2)
            {
                sub.setNo1(no1);
                sub.setNo2(no2);
                ans=sub.getSub();
                System.out.print("Sum of"+ sub.getNo1()+"-"+sub.getNo2()+"="+ans);
            }
            else if(ch==3)
            {
                mul.setNo1(no1);
                mul.setNo2(no2);
                ans=mul.getMul();
                System.out.print("Sum of"+ mul.getNo1()+"*"+mul.getNo2()+"="+ans);
            }
            else
            {
                div.setNo1(no1);
                div.setNo2(no2);
                ans=div.getDiv();
                System.out.print("Sum of"+ div.getNo1()+"*"+div.getNo2()+"="+ans);
            }
        }
}
