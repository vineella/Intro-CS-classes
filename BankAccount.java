
abstract class BankAccount {
    int  depositsThisMonth, numOfWithdrawls;
    double balance = 50000.00, interestRate = .025, msCharge = 25;


    protected void bankAccount(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }
    //method adds deposits and counts number of deposits 
    public void deposit(double add){
        balance += add;
        depositsThisMonth++;   
    }
    
    public void withdraw(double subtract){
        balance -= subtract;
        numOfWithdrawls++;
    }
    public double calcInterest() {
        double mRate = interestRate / 12;
        double mInterest = balance * mRate;
        balance =+ mInterest;
        return balance;
    }

    public void monthlyProcess() {
        balance -= msCharge;
        calcInterest();
        numOfWithdrawls = 0;
        depositsThisMonth = 0;
        msCharge = 0;
        
    }

    public double getBalance() {
        return balance;
    }

    public double getDeposits() {
       return depositsThisMonth;  
    }

    public double getWithdrawls(){
        return numOfWithdrawls;
    }

}
