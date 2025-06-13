class LaptopDriver{
   public static void main(String[] args){
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Laptop l3 = new Laptop();
        
        l1.setDetails("dell", "latitude", "55000", "black");
        l2.setDetails("lenvo", "slim", "100000", "Silver");
        l3.setDetails("apple", "m2", "20000","silver");
   
        System.out.println(l1.getDetails());
        System.out.println(l2.getDetails());
        System.out.println(l3.getDetails());
}
}