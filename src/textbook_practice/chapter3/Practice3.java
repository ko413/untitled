package textbook_practice.chapter3;

public class Practice3 {
    public static void main(String[] args) {
        int isHungry = 1;
        String food = "天ぷら";
        System.out.println("こんにちは");
        if(isHungry == 0){
            System.out.println("お腹いっぱいです");
        }else {
            System.out.println("はらぺこです");
            System.out.println(food + "をいただきます");
            System.out.println("ごちそうさまでした");
        }
    }
}
