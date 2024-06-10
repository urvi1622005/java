import java.util.Scanner;

public class swipe {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();

        // if(fruit.equals("mango")) {
        // System.out.println("king of fruit");
        // }
        // if(fruit.equals("apple")) {
        // System.out.println("a sweet red fruit");
        // }
        // if(fruit.equals(""))
        // switch (fruit) {
        // case "Mango":
        // System.out.println("king of fruit");
        // break;
        // case "Apple":
        // System.out.println("a sweet red fruit");
        // break;
        // case "Orange":
        // System.out.println("a round fruit");
        // break;
        // case "Grapes":
        // System.out.println("Small fruit");
        // break;
        // default:
        // System.out.println("please enter avalid fruit");

        // }
        // switch (fruit) {

        //     case "Mango":
        //         System.out.println("king of fruit");
        //         break;
        //     case "Apple":
        //         System.out.println("a sweet red fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("a round fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("Small fruit");
        //         break;
        //     default:
        //         System.out.println("please enter avalid fruit");

        // }

    //     int day = in.nextInt();
    //     switch (day) {
    //                     case 1:
    //                         System.out.println("Monday");
    //                         break;
    //                     case 2:
    //                         System.out.println("Tuesday");
    //                         break;
    //                     case 3:
    //                         System.out.println("Wednesday");
    //                         break;
    //                     case 4:
    //                         System.out.println("Thursday");
    //                         break;
    //                     case 5:
    //                         System.out.println("Friday");
    //                         break;
    //                     case 6:
    //                         System.out.println("Saturday");
    //                         break;
    //                     case 7:
    //                         System.out.println("Sunday");
    //                         break;

    // }
    int empID = in.nextInt();
    String department = in.next();

    switch (empID) {
        case 1:
            System.out.println("Urvashi dhawan");
            break;
        case 2:
            System.out.println("Rohit dhawan");
        break;
        case 3:
            System.out.println("Emp Number 3");
            switch(department) {
                case "IT":  
                    System.out.println("IT deaprtment");
                break;
                case "Mnagement":
                    System.out.println("Management deapartment");
                    break;
                default:
                    System.out.println("Invalid department");    
            } 
            break; 
        default:
            System.out.println("Enter correct empID");

    }



    }

}
