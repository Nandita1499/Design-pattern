/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Nandita
 */
public class VehicalLoanAccount implements LoanAccount
{

     double amt,r1;
    int n;
    public VehicalLoanAccount()
    {
        amt=0.0;
        r1=0.0;
        n=0;
    }
    @Override
    public double getInterest() 
    {
         return amt-(amt*r1*n)/100;
       /* throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    }

    @Override
    public void setRateofInt(double r) 
    {
          this.r1=r;
        /*throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    }

    @Override
    public void setLoanAccount(double loanamt)
    {
        this.amt=loanamt;
        /*throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    }

    @Override
    public void setNoofYear(int noy) 
    {
         this.n=noy;
        /*throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    }

    @Override
    public String TearmCond() 
    {
        return "Tearm for homeloanaccount minimum 30,000 and maximum 80,000";
        /*throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    }
   
}
