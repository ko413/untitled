package textbook_practice.chapter5;

public class Practice3_Email {
    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名: " + title);
        System.out.println("本文: " + text);
    }
    public static void email(String address, String text) {
        String fixedTitle = "無題";
        email(fixedTitle, address, text);
    }
}
