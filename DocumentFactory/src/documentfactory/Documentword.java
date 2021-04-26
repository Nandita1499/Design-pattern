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
import java.awt.*;
import java.io.*;
import java.lang.Exception;
public class Documentword implements DocumentInterface
{

    @Override
    public String open() 
    {
         try
                {
                    File file=new File("F:\\Design Pattern\\ABC.docx");
                    if(!Desktop.isDesktopSupported())
                    {
                        System.out.println("not supported");
                    }
                    Desktop desktop=Desktop.getDesktop();
                    if(file.exists())
                    {
                        desktop.open(file);
                    }
                }
                catch(Exception e)
                {
                            e.printStackTrace();
                 }
                 return "Open the Word Document";
        /*throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    }
    
    @Override
    public String save()
    {
         try
            {
                File myObj=new File("filename1.docx");
                if(myObj.createNewFile())
                {
                    System.out.println("File created:"+myObj.getName());
                }
                else 
                {
                    System.out.println("File already exists");
                }
            }   
            catch(IOException e)
            {
                System.out.println("An error occured");
                e.printStackTrace();
            }
        return "Save the Word Document";
        /*throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    }
    @Override
    public String close() 
    {
        return "Close the Excel Document";
       /* throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    } 
}
