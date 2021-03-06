package com.company;

/**
 * A class that inherited from account with overloaded method with special case
 */
public class SpecialAccount extends Account{
    /**
     * Empty constructor
     */
    public SpecialAccount()
    {
        super();
    }
    /**
     * parameterized constructor to set the value of the account number
     * @param Account_Number the value of the account number
     */
    public SpecialAccount(int Account_Number){
        super (Account_Number);
    }

    /**
     *  override method withdraw to allow over drafting with maximum limit of 1000 LE
     * @param num the value that he want to take from its balance
     */
    @Override
    public void withdraw(double num){
        if(get_balance()-num>=-1000){
            double new_balance = get_balance()-num;
            set_balance(new_balance );
        }
        else
            System.out.println("Your entry is wrong ");
    }

}