/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentfactory;
/**
 *
 * @author Nandita
 */
import java.util.*;
public class DocumentClient 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        DocumentInterface dc;
        int ch;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("1. Word Document");
        System.out.println("2. Notepad Document");
        System.out.println("3. PDF Document");
        System.out.println("4. Excel Document");
        System.out.println("Enter your choice:-");
        ch=sc.nextInt();
        
        dc=DocumentFactory.getDocumentInterface(ch);
        System.out.println(dc.open());
        System.out.println(dc.close());
        System.out.println(dc.save());
    }
}
