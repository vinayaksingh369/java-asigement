class SphereDriver{
     public static void main(String[] args){
  
    Sphere s1 = new Sphere();
    Sphere s2 = new Sphere();
    s1.setDetail(12.0);
    s2.setDetail(5);
    System.out.println(s1.getDetail());
    System.out.println(s1.getSurfacearea());
    System.out.println(s1.getVolume());
    System.out.println(s2.getDetail());
    System.out.println(s2.getSurfacearea());
    System.out.println(s2.getVolume());

}
}