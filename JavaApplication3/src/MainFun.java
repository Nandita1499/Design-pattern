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
public class MainFun 
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the value of hight:-");
        double h=sc.nextDouble();
        System.out.print("Enter the value of width:-");
        double w=sc.nextDouble();
        
        Rectangle rec=new Rectangle(h,w);
        double ar=rec.Area();
        System.out.println("Area of the Rectangle is "+ar);
        
        
        
        System.out.print("Enter the value of radius:-");
        double r=sc.nextDouble();
        
        Circle cr=new Circle(r);
        ar=cr.Area();
        System.out.println("Area of the Circle is "+ar);
        
        
        
        System.out.print("Enter the value of Square hight and width:-");
        double a=sc.nextDouble();
        
        Square sq=new Square(a);
        ar=sq.Area();
        System.out.println("Area of the Square is "+ar);
    }
}
