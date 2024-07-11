import java.util.Scanner;
public class driving{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("you are an adult");
            System.out.print("Do you have a valid driver's license? (yes/no):");
            String license=scanner.next();
            if(license.equalsIgnoreCase("yes")){
                System.out.println("You can drive");
            }
            else{
                System.out.println("You cannot drive");
            }
        } else {
            System.out.println("you are not an adult");
        }
    }
}
