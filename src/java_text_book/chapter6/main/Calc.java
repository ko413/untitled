package java_text_book.chapter6.main;

import java_text_book.chapter6.calc.CalcLogic;//なければ8、9行目に全部書いてあげなきゃ

public class Calc {
    public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = CalcLogic.tasu(a, b);//クラス名が同じでもパッケージで分ければok
        int delta = CalcLogic.hiku(a, b);
        System.out.println("足すと" + total + "引くと" + delta);
    }
}
