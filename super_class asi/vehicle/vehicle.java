class vehicle {
    String Make;
    String Model;
    int year;
    vehicle() {
        System.out.println("Vehicle is default constructor");
    }
    vehicle(String Make, String Model, int year){
        this.Make = Make;
        this.Model = Model;
        this.year = year;
    }
    public String getVehicleDetails(){
        return "Make: " + Make + "\nModel: " + Model + "\nYear: " + year;
    }
}
