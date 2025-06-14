class circleDriver{
    public static void main (String[] args){
       circle c1 = new circle();
       circle c2 = new circle();
       circle c3 = new circle();
       circle c4 = new circle();
    c1.setDetails(12);
    c2.setDetails(13);
    c3.setDetails(14);
    c4.setDetails(15);
    System.out.println(c1.getDetails());
    System.out.println(c1.getArea());
    System.out.println(c1.getCircumference());
    System.out.println(c1.getDiameter());
    System.out.println("=========***========");
    System.out.println(c2.getDetails());
    System.out.println(c2.getArea());
    System.out.println(c2.getCircumference());
    System.out.println(c2.getDiameter());
    System.out.println("=========***========");
    System.out.println(c3.getDetails());
    System.out.println(c3.getArea());
    System.out.println(c3.getCircumference());
    System.out.println(c3.getDiameter());
    System.out.println("=========***========");
    System.out.println(c4.getDetails());
    System.out.println(c4.getArea());
    System.out.println(c4.getCircumference());
    System.out.println(c4.getDiameter());
    System.out.println("=========***========");
}
}