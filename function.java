import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = in.nextInt();
        System.out.println("Enter number 2");
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+sum);
    }
    
}
