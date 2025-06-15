class CubeDriver{
  public static void main(String[] args){
      Cube c1 = new Cube();
      Cube c2 = new Cube();
    c1.setDetail(5);
    c2.setDetail(6);

    System.out.println(c1.getDetail());
    System.out.println(c1.getVolume());
    System.out.println(c1.getSurfaceArea());
    System.out.println(c1.getLSA());
    System.out.println(c1.getTSA());
    System.out.println("===============*****============");
    System.out.println(c2.getDetail());
    System.out.println(c2.getVolume());
    System.out.println(c2.getSurfaceArea());
    System.out.println(c2.getLSA());
    System.out.println(c2.getTSA());
    System.out.println("===============*****============");
}
}
