import java.util.Scanner;

public class Review16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        for(int j = 0; j < num; j++) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
