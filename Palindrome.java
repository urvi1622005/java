import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toLowerCase();
        int left = 0;
        int right = word.length()-1;
        while (left<right) {
            if (word.charAt(left)==word.charAt(right)) {
                left++;
                right--; 
                System.out.println("True");
            }
    } 
    
        } 

    }     
