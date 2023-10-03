package chapterone.enums;

public class SingletonUsingEnum {

    public static void main(String[] args) {
        Singleton obj1 =  Singleton.INSTANCE;
        obj1.value = 10;
        obj1.show();

        Singleton obj2 = Singleton.INSTANCE;
        obj2.value = 20;

        obj1.show();
    }
}

enum Singleton {
    INSTANCE;
    int value;

    public void show() {
        System.out.println(this);
        System.out.println("value : " + value);
    }

}
