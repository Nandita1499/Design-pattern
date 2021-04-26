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
public final class SingletonDemo 
{
        private static SingletonDemo instance;
        public String value;
        
        private SingletonDemo(String value)
        {
                try
                {
                        Thread.sleep(1000);
                }
                catch(InterruptedException e)
               {
                         e.printStackTrace();
               }
                this.value=value;
        }
        
        public static SingletonDemo getInstance(String value)
        {
                    SingletonDemo result=instance;
                    if(result!=null)
                    {
                        return result;
                    }
                    synchronized(SingletonDemo.class)
                    {
                            if(instance==null)
                            {
                                instance=new SingletonDemo(value);
                            }
                            return instance;
                    }
        }
}
