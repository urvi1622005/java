import java.util.Scanner;
public class positive {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number;
        do{
            System.out.print("Enter a positive number(or 0 to exit)");
            number=scanner.nextInt();
            if(number>0){
                System.out.println("number is positive");
            } else if(number<0){
                System.out.println("number is negative");
            } else{
                System.out.println(" existing the loop.you entered 0");
            }
            } while(number!=0);

        }
    }
    
