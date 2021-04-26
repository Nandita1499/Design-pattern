/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyClient;
import java.io.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author Nandita
 */
public class PArithmetic implements IArithmatic
{
    
    @Override
    public float doIt(float a, float b)  throws IOException
    {
            float a1=a;
            float b1=b;
            float ans,status=(float) 1.0;
            File f1=new File("log.txt");
            String s="Answer is:-";
            FileOutputStream fo=new FileOutputStream(f1);
            BufferedOutputStream bf=new BufferedOutputStream(fo);
            RArithmetic ra=new RArithmetic();
            ans=ra.doIt(a1, b1);
            s=s+ans;
            byte[]  bt=s.getBytes();
            bf.write(bt);
            bf.close();
            fo.close();
            return status;
    }
    
}
