package chaptertwo.inheritance;

public class TestInheritance {

    public static void main(String[] args) {
        String string1 = new String("test1");
        String string2 = new String("test2");
        if (!string1.equals(string2)) {
            System.out.println("they are not equal");
        }
        if (string1 instanceof Object) {
            System.out.println("String is inherited from object class");
        }
    }

}
