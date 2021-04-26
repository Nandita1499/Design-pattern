/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nandita
 */
public class SavingBankAccount extends Account
{
    private static final double DEFAULT_OVERDRAFT=-1000;
    public SavingBankAccount(String owner,double intialDeposit)
    {
       super(owner,intialDeposit);
    }
    
    @Override
    public int createAcc() 
    {
        
       /* throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
        accno=accno+1;
        return accno;
    }

    @Override
    public boolean withdraw(double amt) 
    {
        /*throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
      if(amt<0)
      {
            System.err.println("Negative amount can't be withdraw");
          return false;
      }
      if((balance-amt-30)<DEFAULT_OVERDRAFT)
      {
            System.err.println("Not enough balance");
      }
      if((balance-amt<0))
      {
          balance=balance-amt-30;
          return true;
      }
      return false;
    }
    public String toString()
    {
        String returnString;
        if(balance<500)
        {
            returnString=super.toString();
            return returnString;
        }
        return super.toString();
    }
   
}
