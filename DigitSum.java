//given any integer add the numbers given in an integer 
//if the sum is greater than 10 again sum the resulted sum  
//until you get single digit which is les than 10 provide java code
import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = calculateDigit(num);
        
        while (digit >= 10) {
            System.out.println(digit);
            digit = calculateDigit(digit); // Update digit with the new calculated value
        }
        
        System.out.print(digit);
    }

    public static int calculateDigit(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}

