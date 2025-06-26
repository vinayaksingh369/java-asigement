// Driver class
class Driver {
    public static void main(String[] args) {
        // Create objects
        CarLoan c1 = new CarLoan("CL0110", 234567.0, 9.3, "Mohan", "UP14Z1234");
        CarLoan c2 = new CarLoan("CL0111", 345678.0, 8.7, "Ravi", "DL8CAF9001");

        // Print details directly
        System.out.println(c1.getLoanDetails());

        // Store in String and print
        String details = c2.getLoanDetails();
        System.out.println("-----------------------");
        System.out.println(details);
    }
}
