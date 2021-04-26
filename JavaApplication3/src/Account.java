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
import java.text.NumberFormat;
public abstract class Account 
{
    private static int defaultAccountNo=12345;
    protected double minbal,amt,balance;
    protected int accno;
    protected int acctype;
    protected String owner;
    
    public Account(String owner,double intialDeposit)
    {
        this.owner=owner;
        this.balance=intialDeposit;
        defaultAccountNo++;
        this.accno=defaultAccountNo;
    }
    public abstract int createAcc();
    public abstract boolean withdraw(double amt);
    public boolean diposit(double a)
    {
       if(amt<=0)
       {
           System.out.println("Negative amount can't be deposited");
           return false;
       }
       balance=balance+amt;
       return true;
    }
    public double getBalance()
    {
        return balance;
    }
    public int getAccount()
    {
        return accno;
    }
    public void setOwner(String Owner)
    {
        this.owner=owner;
    }
    public boolean equals(Account account)
    {
        if(this.owner.equalsIgnoreCase(account.owner))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String toString()
    {
        return "AccountNo:"+accno+"\nBalance:"+balance;
    }
    public void closeAC()
    {
        amt=0;
        accno=0;
    }
}




















