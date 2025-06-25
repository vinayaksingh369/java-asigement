import java.util.Scanner;

class Factor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number x:");
        int x = sc.nextInt();
        System.out.println("enter the number y:");
        int y = sc.nextInt();
        String result= (x % y==0)?"x is factor of y":"x is not factor of y";
        System.out.println(result);
        
    }
}