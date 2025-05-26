package textbook_practice.chapter4;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        int numbers[] = new int[] {3, 4, 9};
        System.out.println("1桁の数字を入力してください");
        int input = new Scanner(System.in).nextInt();
        for(int i = 0; i<numbers.length; i++){
            if(input == numbers[i]){
                System.out.println("アタリ！");
                break;
            }
        }
    }
}
