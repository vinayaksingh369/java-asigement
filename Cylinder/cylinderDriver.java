class CylinderDriver {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder();
        Cylinder c3 = new Cylinder();
        Cylinder c4 = new Cylinder();

        c1.setDetails(12.0, 5.0);
        c2.setDetails(2.0, 1.0);
        c3.setDetails(4.0, 3.0);
        c4.setDetails(13.0, 6.0);

        System.out.println(c1.getDetails());
        System.out.println(c1.getTSA());
        System.out.println(c1.getLSA());
        System.out.println("===============*****============");

        System.out.println(c2.getDetails());
        System.out.println(c2.getTSA());
        System.out.println(c2.getLSA());
        System.out.println("===============*****============");

        System.out.println(c3.getDetails());
        System.out.println(c3.getTSA());
        System.out.println(c3.getLSA());
        System.out.println("===============*****============");

        System.out.println(c4.getDetails());
        System.out.println(c4.getTSA());
        System.out.println(c4.getLSA());
        System.out.println("===============*****============");
    }
}
