package other;

public class Test {
    int data = 10;

    public static void main(String[] args) {
        final Test test = new Test();
        test.data = 20;
        System.out.println(test.data);
    }
}
