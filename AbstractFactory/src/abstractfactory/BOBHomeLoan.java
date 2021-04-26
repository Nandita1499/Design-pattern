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
public class BOBHomeLoan implements IHomeLoan
{
    double amt,r1;
    int n;
    
    public BOBHomeLoan()
    {
        amt=0.0;
        r1=0.0;
        n=0;
    }
    @Override
    public double getLoan() 
    {
        return amt+(amt*r1*n)/100;
    }

    @Override
    public double getInterest()
    {
          return (amt*r1*n)/100;
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
        return "BOBH-Tearm for homeloanaccount minimum 40,000 and maximum 5,00,000";
    }
    
}
