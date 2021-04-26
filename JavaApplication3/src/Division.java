/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nandita
 */
import java.util.*;
public class Division 
{
    private double no1,no2,ans;
    public Division()
    {
        no1=0;
        no2=0;
        ans=0;
    }
    public Division(double n1,double n2)
    {
        this.no1=n1;
        this.no2=n2;
    }
    public double getNo1()
    {
      return no1;  
    }
    public void setNo1(double n1)
    {
        this.no1=n1;
    }
     public double getNo2()
    {
      return no2;  
    }
    public void setNo2(double n2)
    {
        this.no2=n2;
    }      
    public double getDiv()
    {
        ans=doDiv();
        return ans;
    }
    private double doDiv()
    {
        return no1/no2;
    }    
}
