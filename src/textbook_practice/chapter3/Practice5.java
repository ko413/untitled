package textbook_practice.chapter3;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("[メニュー]１：検索２：登録３：削除４：変更＞");
        int selected = input.nextInt();
        switch (selected) {
            case 1:
                System.out.print("検索します");
                break;
                case 2:
                    System.out.print("登録します");
                    break;
                    case 3:
                        System.out.print("削除します");
                        break;
                        case 4:
                            System.out.print("変更します");
                            break;
                            default:
                                break;
        }
    }
}
