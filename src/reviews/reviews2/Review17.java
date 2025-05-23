package reviews.reviews2;

import java.util.Scanner;

public class Review17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        for (i = 1; i <= num; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
