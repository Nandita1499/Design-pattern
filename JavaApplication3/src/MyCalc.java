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
public class MyCalc 
{
    public static void main(String s[])
    {
        double no1,no2,ans;
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number:-");
        no1=sc.nextDouble();
        System.out.println("Enter Second Number:-");
        no2=sc.nextDouble();
        
        System.out.print("1.Addition");
        System.out.print("2.Subtracrtion");
        System.out.print("3.Mulitiplication");
        
        System.out.print("Enter your choice");
        ch=sc.nextInt();
        if(ch==1)
        {
            ans=no1+no2;
        }
        else if(ch==2)
        {
            ans=no1-no2;
        }
        else
        {
            ans=no1*no2;
        }
        System.out.print("Answer="+ans);
    }
}
