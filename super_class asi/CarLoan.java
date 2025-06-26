class CarLoan extends Loan {
    String name;
    String carNo;

    // Default constructor
    CarLoan() {
        System.out.println("CarLoan() default constructor");
    }

    // Parameterized constructor
    CarLoan(String loanNo, double amount, double roi, String name, String carNo) {
        super(loanNo, amount, roi); // Call parent constructor
        this.name = name;
        this.carNo = carNo;
    }

    // Overridden method using super
    public String getLoanDetails() {
        return super.getLoanDetails() + "\nName: " + name + "\nCar No: " + carNo + "\n[In CarLoan Class]";
    }
}
