interface Employee {
    double earnings(double basic);
    double deductions(double basic);
}

class Manager implements Employee {
    public double earnings(double basic) {
        double da = basic * 0.8;
        double hra = basic * 0.15;
        return basic + da + hra;
    }

    public double deductions(double basic) {
        double pf = basic * 0.12;
        return pf;
    }
}

class Substaff extends Manager {
    public double bonus(double basic) {
        return basic * 0.5;
    }
}

public class question1 {
    public static void main(String[] args) {
        Substaff s = new Substaff();
        double basic = 5000.0;
        double earnings = s.earnings(basic);
        double deductions = s.deductions(basic);
        double bonus = s.bonus(basic);
        double netPay = earnings - deductions + bonus;
        System.out.println("Basic Salary: " + basic);
        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Pay: " + netPay);
    }
}
