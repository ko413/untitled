package textbook_practice.chapter5;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("宛先メールアドレス>");
        String address = input.nextLine();
        System.out.print("本文>");
        String text = input.nextLine();
        Practice2 email = new Practice2();
        Practice2.email("無題", address, text);
    }
}
