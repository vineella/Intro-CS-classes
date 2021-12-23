
public class savingsAccount extends BankAccount {
   private boolean active; 
    
    public savingsAccount(double balance, double interestRate){
        if(balance >= 25){
            active = true;
        }

        else {
            active = false;
        }
    }   
    
    public void withdraw(double amount) {
        if (active){
            super.withdraw(amount);
            if (super.getBalance() < 25){
                active = false;
            }
        }
        else {
            System.out.println("Account is inactive");
        }
    }

    public void deposit(double amount){
        double currentBalance;
        if(!active){
            currentBalance = super.getBalance() + amount;
            if (currentBalance > 25){
                active = true;
            }
        }
        super.deposit(amount);
    }  

    public void monthlyProcess(double deposit){
        if (numOfWithdrawls > 4);
        msCharge++; 
    }
} 

