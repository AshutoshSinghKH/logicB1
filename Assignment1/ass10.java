import java.util.Scanner;

public class ass10 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a = input.nextInt();
        
        if (a % 2 == 0) {
            System.out.println("The no Is even");
        } else {
            System.out.println("The no is odd");
        }
        
     
    }
}
