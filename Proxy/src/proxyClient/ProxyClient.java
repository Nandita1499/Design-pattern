/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyClient;

import java.io.IOException;

/**
 *
 * @author Nandita
 */
public class ProxyClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException
    {
        PArithmetic p=new PArithmetic();
        //RArithmetic p=new RArithmetic();
        float ans,i,j;
        i=10;
        j=22;
        ans= p.doIt(i,j);
        System.out.println(ans);
        // TODO code application logic here
    }
    
}
