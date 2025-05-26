package textbook_practice.chapter2;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください>");
        String name = input.nextLine();
        System.out.println(name);
        System.out.print("あなたの年齢を入力してください>");
        String ageString = input.nextLine();
        System.out.println(ageString);
        int age = Integer.parseInt(ageString);
        int fortune = (int)(Math.random() * 4);
        fortune++;
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運勢は" + fortune + "です");
        System.out.print("(1：大吉 2：中吉 3：吉 4：凶)");

    }
}
