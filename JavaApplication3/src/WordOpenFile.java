/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nandita
 */
import java.awt.*;
import java.io.*;
import java.lang.Exception;
public class WordOpenFile 
{
        public static void main(String s[]) throws IOException
        {
                try
                {
                    File file=new File("C:\\TYBCA\\ABC.docx");
                    if(!Desktop.isDesktopSupported())
                    {
                        System.out.println("not supported");
                        return;
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
        }
}
