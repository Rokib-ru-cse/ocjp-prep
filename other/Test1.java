package other;

public class Test1 extends Test {

    public static void main(String[] args) {
        boolean b = false;
        if (b = true) {
            System.out.println("ss");
        } else {
            System.out.println("s");
        }
        int i = 5;
        System.out.println(i++ + --i);
    }
}
