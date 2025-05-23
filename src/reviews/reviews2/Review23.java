package reviews.reviews2;

import java.util.Scanner;

public class Review23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}
