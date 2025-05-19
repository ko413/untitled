import java.util.Scanner;

public class Review19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        int count = num;
        for (int i = 1; i <= count; i++) {
            factorial *= num;
            num--;
        }
        System.out.println(factorial);
    }
}
