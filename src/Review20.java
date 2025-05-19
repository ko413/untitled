import java.util.Scanner;

public class Review20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reNum = num;
        while (reNum > 1) {
            num += (num -1);
            num--;
        }
        System.out.println(num);
    }
}
