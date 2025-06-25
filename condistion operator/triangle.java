import java.util.Scanner;

class triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number x:");
        int x = sc.nextInt();
        System.out.println("enter the number y:");
        int y = sc.nextInt();
        System.out.println("enter the number z:");
        int z = sc.nextInt();
        String result= (x+y+z==180)?"three side of triangle is valid":"three side of trianleis not valid";
        System.out.println(result);
        
    }
}