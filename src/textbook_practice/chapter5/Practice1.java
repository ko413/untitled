package textbook_practice.chapter5;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        introduceOneself();
    }
    public static void introduceOneself() {
        Scanner input = new Scanner(System.in);
        System.out.print("名前>");
        String name = input.nextLine();
        System.out.print("年齢>");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("身長>");
        double tall = input.nextDouble();
        System.out.print("干支>");
        char zodiac = input.next().charAt(0);
        input.nextLine();
        System.out.println("私の名前は " + name + "です。歳は" + age + "歳です。身長は" + tall + "です。十二支は" + zodiac + "です。");
    }
}
