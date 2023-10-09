package chapterthree.gc;

public class ManualGC {

    static String string = new String("test");

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        System.gc();
    }
}
