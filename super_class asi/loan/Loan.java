class Loan {
    String loanNo;
    double amount;
    double roi; // rate of interest

    // Default constructor
    Loan() {
        System.out.println("Loan() default constructor");
    }

    // Parameterized constructor
    Loan(String loanNo, double amount, double roi) {
        this.loanNo = loanNo;
        this.amount = amount;
        this.roi = roi;
    }

    // Method to get loan details
    public String getLoanDetails() {
        return "Loan No: " + loanNo + "\nAmount: " + amount + "\nROI: " + roi;
    }
}