import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting the number of rows for the jagged array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
               
                int[][] jaggedArray = new int[rows][];
                
                // Getting the size of each row and the elements for each row
                for (int i = 0; i < rows; i++) {
                    System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
                    int cols = scanner.nextInt();
                    jaggedArray[i] = new int[cols];
                    
                    for (int j = 0; j < cols; j++) {
                        System.out.print("Enter element for jaggedArray[" + i + "][" + j + "]: ");
                        jaggedArray[i][j] = scanner.nextInt();
                    }
                }
                
                // Displaying the jagged array
                System.out.println("The jagged array is:");
                for (int i = 0; i < jaggedArray.length; i++) {
                    for (int j = 0; j < jaggedArray[i].length; j++) {
                        System.out.print(jaggedArray[i][j] + " ");
                    }
                    System.out.println();
                }
    }
}