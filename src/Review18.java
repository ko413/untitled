import java.util.Scanner;

public class Review18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        for (i = 1; i <= num; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
