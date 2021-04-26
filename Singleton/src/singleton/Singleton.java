/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;
/**
 *
 * @author Nandita
 */
public class Singleton 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
            int count=0;
            
            Details dt1=Details.getInstance("Nandita Halai");
            Details dt2=Details.getInstance("Mani Vora");
            Details dt3=Details.getInstance("Mani Bhudiya");
            if(count<2)
            {
                    dt1.setAge(21);
                    System.out.println(dt1.getDT());
                    count++;
            }   
           if(count<2)
            {
                    dt2.setAge(20);
                    System.out.println(dt2.getDT());
                    count++;
            }   
           if(count<2)
            {
                    dt3.setAge(22);
                    System.out.println(dt3.getDT());
                    count++;
            }   
        // TODO code application logic here
    }
    
}
