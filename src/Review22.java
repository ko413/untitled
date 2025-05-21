import java.util.Scanner;

public class Review22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= num) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
