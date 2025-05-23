package reviews.reviews1;

public class Review5 {
    public static void main(String[] args) {
        int a = 10; int b = 20; int c = 10;
        boolean f = false;
        f = (a == b);
        System.out.println(f);
        f = (a == c);
        System.out.println(f);
        f = (a != b);
        System.out.println(f);
        f = (a != c);
        System.out.println(f);
        f = (a < b);
        System.out.println(f);
        f = (a <= c);
        System.out.println(f);
        f = (a > b);
        System.out.println(f);
        f = (a >= c);
        System.out.println(f);
        f = (a + 10 == b);
        System.out.println(f);
        f = (c + 10 < b + -5);
        System.out.println(f);
    }
}
