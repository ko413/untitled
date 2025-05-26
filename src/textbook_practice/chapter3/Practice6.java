package textbook_practice.chapter3;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("【数あてゲーム】");
        int ans = (int)(Math.random() * 9) + 1;
        for(int i = 0; i < 5; i++) {
            System.out.print("0〜9の数字を入力してください");
            int num = input.nextInt();
            if(num == ans) {
                System.out.println("アタリ！");
                break;
            }else {
                System.out.println("違います");
            }
        }
        System.out.print("ゲームを終了します");
    }
}
