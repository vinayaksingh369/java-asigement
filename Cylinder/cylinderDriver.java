class cylinderDriver{
  public static void main(String []args);
      cylinder c1 =new cylinder();
      cylinder c2 =new cylinder();
      cylinder c3 =new cylinder();
      cylinder c4 =new cylinder();

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
    