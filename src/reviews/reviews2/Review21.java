package reviews.reviews2;

import java.util.Scanner;

public class Review21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= num) {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
