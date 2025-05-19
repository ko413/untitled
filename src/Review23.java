import java.util.Scanner;

public class Review23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
