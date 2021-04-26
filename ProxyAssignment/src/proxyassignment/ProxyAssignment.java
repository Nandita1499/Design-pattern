/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyassignment;
/**
 *
 * @author Nandita
 */
public class ProxyAssignment
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        IURL iurl = new PInternetAccess(); 
        try
        { 
             iurl.doConnect("www.gujaratvidyapith.org");
             iurl.doConnect("www.gv.org");
        } 
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    }
    
}
