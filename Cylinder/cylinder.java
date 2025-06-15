
class Cylinder {
    double r;
    double h;

    // Method to set radius and height
    public void setDetails(double r, double h) {
        this.r = r;
        this.h = h;
    }

    // Method to return cylinder details
    public String getDetails() {
        return "Cylinder radius is: " + r + " unit\t Height of Cylinder is: " + h + " unit";
    }

    // Method to return Total Surface Area (TSA)
    public String getTSA() {
        return "Cylinder TSA is: " + (2 * Math.PI * r * (r + h)) + "\t Square unit";
    }

    // Method to return Lateral Surface Area (LSA)
    public String getLSA() {
        return "Cylinder LSA is: " + (2 * Math.PI * r * h) + "\t Square unit";
    }
}
