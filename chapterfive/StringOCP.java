package chapterfive;

public class StringOCP {
    public static void main(String[] args) {
        String string = new String("test");
        String string1 = "test";
        System.out.println(string.equals(string1));
        System.out.println(string == string1);
        string.concat("sss");
        System.out.println(string);
    }
}
