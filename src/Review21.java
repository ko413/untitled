import java.util.Scanner;

public class Review21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = num;
        int sum = 0;
        while (count > 0) {
            if(num % 2 == 0) {
                sum += num;
            }
            num--;
        }
        System.out.println(sum);
    }
}
