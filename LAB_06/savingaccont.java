public class savingaccont {
    // static variable to store annual interest rate for all account holders
    private static double annual_Interest_Rate = 0.0;
    
    private double savings_Balance;
    
    public savingaccont(double balance) {
        // initialize savings balance
        savings_Balance = balance;
    }
    
    public void calculate_Monthly_Interest() {
        // calculate monthly interest and add it to savings balance
        double monthly_Interest_Rate = annual_Interest_Rate / 12;
        savings_Balance += savings_Balance * monthly_Interest_Rate;
    }
    
    public static void modify_Interest_Rate(double newRate) {
        // modify annual interest rate
        annual_Interest_Rate = newRate;
    }
    
    public double get_Savings_Balance() {
        // return current savings balance
        return savings_Balance;
    }
    
    public static void main(String[] args) {
        // instantiate two Savings_Account objects
        savingaccont saver1 = new savingaccont(2000.0);
        savingaccont saver2 = new savingaccont(3000.0);
        
        // set annual interest rate to 4%
        savingaccont.modify_Interest_Rate(0.04);
        
        // calculate monthly interest and print new balances
        saver1.calculate_Monthly_Interest();
        saver2.calculate_Monthly_Interest();
        System.out.println("Saver 1 balance after 1 month: " + saver1.get_Savings_Balance());
        System.out.println("Saver 2 balance after 1 month: " + saver2.get_Savings_Balance());
        
        // set annual interest rate to 5%
        savingaccont.modify_Interest_Rate(0.05);
        
        // calculate monthly interest and print new balances
        saver1.calculate_Monthly_Interest();
        saver2.calculate_Monthly_Interest();
        System.out.println("Saver 1 balance after 2 months: " + saver1.get_Savings_Balance());
        System.out.println("Saver 2 balance after 2 months: " + saver2.get_Savings_Balance());
    }
}
