/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyassignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nandita
 */
public class RInternetAccess implements IURL
{
    private static List<String> connectSite; 
    
    static 
    {
            connectSite=new ArrayList<>();
            connectSite.add("www.gujaratvidyapith.org");
    }
    @Override
    public void doConnect(String URL)
    {
           System.out.println("You Are Connected with "+URL);
    }
    
}
