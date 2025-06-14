class vehicleDriver{
   public static void main (String[]args){
        vehicle v1 = new vehicle();
        vehicle v2 = new vehicle();
        vehicle v3 = new vehicle();

      v1.setDetails("maruti","1995t","1997");
      v2.setDetails("toyoto","fortuner","2010");
      v3.setDetails("mahindra","thar4X4","2022");
     
      System.out.println(v1.getDetails());
      System.out.println(v2.getDetails());
      System.out.println(v3.getDetails());
}
}