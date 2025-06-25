import java.util.Scanner;

class number511 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int x = sc.nextInt();
        String result=(x%5==0 && x%11==0)?"number is divisibleby 5,11":"number is not divisibleby 5,11";
        System.out.println(result);
        
    }
}