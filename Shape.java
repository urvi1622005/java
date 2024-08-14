public class Shape {
    public int area(int width, int height) {
        return width * height;
    }
    
    public int area(int side) {
        return side * side;
    }

    public static void main(String args[]) {
         Shape shape = new Shape();
        
      int result1 = shape.area(5, 10);
        
        
        int result2 = shape.area(5);
       
        System.out.println("Area of rectangle: " + result1);
        System.out.println("Area of square: " + result2);
    }
}