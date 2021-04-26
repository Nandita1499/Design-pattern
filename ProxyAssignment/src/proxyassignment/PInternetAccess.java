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
public  class PInternetAccess implements IURL
{
      private IURL url = new RInternetAccess(); 
      private static List<String> bannedSite; 
      
      static 
      {
          bannedSite=new ArrayList<>();
          bannedSite.add("www.gv.org");
          bannedSite.add("www.unipay2u.com");
          bannedSite.add("www.unipay2u-international.com");
          bannedSite.add("www.ad2earn.com");
          bannedSite.add("www.ksv.com");
          bannedSite.add("www.metacafe.com/channels/Satish+seth");
          bannedSite.add("www.tiktok.com");
          bannedSite.add("www.google0.ingo");
          bannedSite.add("www.bloggernews.net/124029/");
          bannedSite.add("www.twitter.com/satishsethswan");
      }

    @Override
    public void doConnect(String URL) throws Exception
    { 
        if(bannedSite.contains(URL)) 
        { 
             throw  new Exception(URL+" Site Is Banned "); 
        }
        url.doConnect(URL);
    } 
}
