/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;
/**
 *
 * @author Nandita
 */
public class BOBPersonalLoan implements IPersonalLoan
{

       double amt,r1;
       int n;
       public BOBPersonalLoan()
       {
            amt=0.0;
            r1=0.0;
            n=0;
       }
    @Override
    public double getLoan() 
    {
        return (amt*r1*n)/100;
    }

    @Override
    public double getInterest() 
    {
        return amt-(amt*r1*n)/100;
    }

    @Override
    public void setRateofInt(double r)
    {
       this.r1=r;
    }

    @Override
    public void setLoanAccount(double lamt) 
    {
        this.amt=lamt;
    }

    @Override
    public void setNoofYear(int noy) 
    {
        this.n=noy;
    }

    @Override
    public String TearmCond()
    {
         return "BOBP-Tearm for homeloanaccount minimum 7,000 and maximum 1,00,000";
    }
    
}
