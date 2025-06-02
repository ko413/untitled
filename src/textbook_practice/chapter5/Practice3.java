package textbook_practice.chapter5;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("宛先メールアドレス>");
        String address2 = input.nextLine();
        System.out.print("本文>");
        String text2 = input.nextLine();
        Practice3_Email.email(address2, text2);
    }
}
