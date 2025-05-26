package textbook_practice.chapter5;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("件名>");
        String title = input.nextLine();
        System.out.print("宛先メールアドレス>");
        String address = input.nextLine();
        System.out.print("本文>");
        String text = input.nextLine();
        email(title, address, text);
    }
    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名: " + title);
        System.out.println("本文: " + text);
    }
}
