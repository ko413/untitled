import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Review9 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("名前を入力してください。");
        String inputName = br.readLine();
        System.out.print("年齢を入力してください>");
        int age = Integer.parseInt(br.readLine());

        System.out.println(age + "歳の" + inputName + "さん。" + "\n"+ "こんにちは。");

    }
}
