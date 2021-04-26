/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton1;

/**
 *
 * @author Nandita
 */
public class PrintSpooler
{

        private static  PrintSpooler spooler;
        private String message;
     
        static
        {
                spooler=new PrintSpooler();
        }
        
}
