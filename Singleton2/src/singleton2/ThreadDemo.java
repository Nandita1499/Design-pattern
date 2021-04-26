/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton2;

/**
 *
 * @author Nandita
 */
import java.util.*;
public class ThreadDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        System.out.println("If you see the same value in singleton then it was reused\n\n");
        
        Thread threadMorning=new  Thread(new ThreadMorning());
        Thread threadHello=new  Thread(new ThreadHello());
        
        threadMorning.start();
        threadHello.start();
    }
        
        static class ThreadMorning  implements  Runnable
        {

                 @Override
                public void run() 
                {
                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    SingletonDemo singleton=SingletonDemo.getInstance("Good Morning");
                    System.out.println(singleton.value);
                 }
         }
        static class ThreadHello implements Runnable
        {

             @Override
                public void run() 
                {
                         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    SingletonDemo singleton=SingletonDemo.getInstance("Hello Welcome");
                    System.out.println(singleton.value);
                  }
            
        }
}
