public class FruitDriver {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit();
        Fruit f3 = new Fruit();
        
        f1.setDetails("Apple", "Red", 150);
        f2.setDetails("Banana", "Yellow", 120);
        f3.setDetails("Grapes", "Green", 200);
        
        System.out.println(f1.getDetails());
        System.out.println(f2.getDetails());
        System.out.println(f3.getDetails());
    }
}
