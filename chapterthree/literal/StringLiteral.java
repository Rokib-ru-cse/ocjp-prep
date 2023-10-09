package chapterthree.literal;

public class StringLiteral {

    public void changeString(StringBuilder string) {
        System.out.println("inside method 1 " + string);
        string.append("a");
        string = null;
        System.out.println("inside method 2 " + string);
    }

    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("test");
        new StringLiteral().changeString(string);
        System.out.println("main method " + string);
    }
}
