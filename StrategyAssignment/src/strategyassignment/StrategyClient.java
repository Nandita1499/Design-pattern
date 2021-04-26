package strategyassignment;

import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nandita
 */
public class StrategyClient 
{
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                
                System.out.print("Enter Income For Residencial Property:-");
                double income=sc.nextDouble();
                conext c1=new conext(new ResidencialProperty());
                System.out.println("Residencial Property Tax is  "+c1.countTax(income));
               
                System.out.print("Enter Income For Commerical Property:-");
                double income1=sc.nextDouble();
                c1=new conext(new CommericalProperty());
                System.out.println("Commerical Property Tax is  "+c1.countTax(income1));
                
                System.out.print("Enter Income For Hopital Institue:-");
                double income2=sc.nextDouble();
                c1=new conext(new HospitalInstitute());
                System.out.println("Hospital Institue Tax is  "+c1.countTax(income2));
                
                System.out.print("Enter Income For Education Institue:-");
                double income3=sc.nextDouble();
                c1=new conext(new EducationalInstitue());
                System.out.println("Education Institue Tax is  "+c1.countTax(income3));
        }
}
