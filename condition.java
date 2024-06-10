import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age>18){
        // System.out.println("Adult");
        // } else {
        // System.out.println("Not Adult");
        // }
        // int number = sc.nextInt();

        // if(number%2==0){
        // System.out.println("Even number");

        // } else {
        // System.out.println("odd number");
        // }
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a>b){
        // System.out.println("a is greater");

        // } else if(a<b) {
        // System.out.println("a is lesser");
        // } else{
        // System.out.println("they are equal");
        // }
        // int button =sc.nextInt();

        // if(button == 1){
        // System.out.println("Hello");
        // } else if(button == 2){
        // System.out.println("Nameste");
        // } else if(button == 3) {
        // System.out.println("Bonjour");
        // } else {
        // System.out.println("Invalid button");
        // }
        // switch(button) {
        // case 1 : System.out.println("hello");
        // break;
        // case 2 : System.out.println("Namaste");
        // break;
        // case 3 : System.out.println(" Bonjour");
        // break;
        // default : System.out.println("Invalid button");
        // }
        // homework problem
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int Addition = a+b;
        // System.out.println(Addition);
        // int Subtraction = a-b;
        // System.out.println(Subtraction);
        // int Multiplication =a*b;
        // System.out.println(Multiplication);
        // int Division = a/b;
        // System.out.println(Division);
        // int Modulo =a%b;
        // System.out.println(Modulo);
        // 2 problem
//         int number = sc.nextInt();
//         switch (number) {
//             case 1:
//                 System.out.println("January");
//                 break;
//             case 2:
//                 System.out.println("February");
//                 break;
//             case 3:
//                 System.out.println("March");
//                 break;
//             case 4:
//                 System.out.println("April");
//                 break;
//             case 5:
//                 System.out.println("May");
//                 break;
//             case 6:
//                 System.out.println("June");
//                 break;
//             case 7:
//                 System.out.println("July");
//                 break;
//             case 8:
//                 System.out.println("August");
//                 break;
//             case 9:
//                 System.out.println("September");
//                 break;
//             case 10:
//                 System.out.println("October");
//                 break;
//             case 11:
//                 System.out.println("November");
//                 break;
//             case 12:
//                 System.out.println("December");
//                 break;
//             default:
//                 System.out.println("Invalid number");
//         }

//     }

// }
int ans=0;
while(true) {
    System.out.println("Enter the operator");
    char op =in.next().trim().charAt(0);
    if( op == '+' || op == '*' || op == '/' || op == '%' || op == '-') {
        System.out.println("Enter two numbers");
        int num1 =in.nextInt();
        int num2 =in.nextInt();

        if (op =='+') {
            ans=num1+num2;
        }
        if (op =='*') {
            ans=num1*num2;
        }
        if (op =='/') {
            ans=num1/num2;
        }
        if (op =='%') {
            ans=num1%num2;
        }
        if (op =='-') {
            ans=num1-num2;
        }
    }
        System.out.println(ans);
        // if (op == 'x' || op == 'X') {
        //     break;
        // } else {
        //     System.out.println("invalid operation");
        }

    }
//     System.out.println(ans);
}


