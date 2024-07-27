import java.util.Scanner;

public class JaggedArrayOperations {

    static int[][] jaggedArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jagged array size
        System.out.print("Enter the number of rows in the jagged array: ");
        int rows = scanner.nextInt();
        
        jaggedArray = new int[rows][];
        
        // Input each row size and elements
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            jaggedArray[i] = new int[cols];
            
            System.out.println("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }
        
        // Display initial jagged array
        System.out.println("Initial Jagged Array:");
        printJaggedArray();
        
        // Perform operations
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Search for an element");
            System.out.println("4. Sum of all elements");
            System.out.println("5. Traverse the array");
            System.out.println("6. Exit");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter row, column, and value to insert: ");
                    int row = scanner.nextInt();
                    int col = scanner.nextInt();
                    int value = scanner.nextInt();
                    insert(row - 1, col - 1, value);
                    break;
                case 2:
                    System.out.print("Enter row and column to delete: ");
                    row = scanner.nextInt();
                    col = scanner.nextInt();
                    delete(row - 1, col - 1);
                    break;
                case 3:
                    System.out.print("Enter value to search for: ");
                    value = scanner.nextInt();
                    System.out.println(search(value));
                    break;
                case 4:
                    System.out.println("Sum of all elements: " + sumOfElements());
                    break;
                case 5:
                    System.out.println("Traversal of the array:");
                    traverse();
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    public static void printJaggedArray() {
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static String search(int value) {
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                if (jaggedArray[i][j] == value) {
                    return "Found at (" + (i + 1) + ", " + (j + 1) + ")";
                }
            }
        }
        return "Not found";
    }

    public static int sumOfElements() {
        int sum = 0;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                sum += jaggedArray[i][j];
            }
        }
        return sum;
    }

    public static void insert(int row, int col, int value) {
        if (row < jaggedArray.length && col < jaggedArray[row].length) {
            jaggedArray[row][col] = value;
            System.out.println("Value inserted.");
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public static void delete(int row, int col) {
        if (row < jaggedArray.length && col < jaggedArray[row].length) {
            jaggedArray[row][col] = 0;
            System.out.println("Value deleted.");
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public static void traverse() {
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
        }
        System.out.println();
    }
}
