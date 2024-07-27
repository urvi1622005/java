public class ArrayOperations {
    
    static int[][] array = new int[9][9];

    
    public static void printArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // i) Search
    public static String search(int value) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == value) {
                    return "Found at (" + i + ", " + j + ")";
                }
            }
        }
        return "Not found";
    }

    
    public static void traverse() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    
    public static int sumOfElements() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    
    public static void insert(int row, int col, int value) {
        if (row < array.length && col < array[row].length) {
            array[row][col] = value;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    
    public static void delete(int row, int col) {
        if (row < array.length && col < array[row].length) {
            array[row][col] = 0;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public static void main(String[] args) {
        System.out.println("Initial 2D Array:");
        printArray();

        
        insert(0, 0, 5);
        insert(1, 1, 10);
        insert(2, 2, 15);

        System.out.println("Array after insertions:");
        printArray();

        
        System.out.println("Search for value 10:");
        System.out.println(search(10));

        
        System.out.println("Traversal of the array:");
        traverse();

        
        System.out.println("Sum of all elements:");
        System.out.println(sumOfElements());

        
        delete(1, 1);
        System.out.println("Array after deletion:");
        printArray();
    }
}
