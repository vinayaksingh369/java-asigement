package vehicle;

class car extends vehicle {
    String name;
    String carNo;

    // Default constructor
    car() {
        System.out.println("Car() default constructor");
    }

    // Parameterized constructor
    car(String Make, String Model, int year, String name, String carNo) {
        super(Make, Model, year); // Call parent constructor
        this.name = name;
        this.carNo = carNo;
    }

    // Overridden method using super
    public String getVehicleDetails() {
        return super.getVehicleDetails() + "\nName: " + name + "\nCar No: " + carNo + "\n[In Car Class]";
    }
}
