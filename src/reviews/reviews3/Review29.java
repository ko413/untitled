package reviews.reviews3;

public class Review29 {
    public static void main(String[] args) {
        Keyinput keyinput = new Keyinput();
        System.out.println("宛先を入力>");
        String to = keyinput.readString();
        System.out.println("件名を入力>");
        String subject = keyinput.readString();
        System.out.println("本文を入力>");
        String body = keyinput.readString();
        System.out.println(to + "に以下のメールを送信しました。");
        System.out.println("件名：" + subject);
        System.out.println("本文：" + body);
    }
}
