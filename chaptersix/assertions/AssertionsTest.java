package chaptersix.assertions;

public class AssertionsTest {

    public static void testAssertions(int data) {
        int x = data + 10;
        assert x >= 0 : "Number should not be negative";
    }

    /**
     * To enable assertions when running your Java program, you should use the -ea or -enableassertions JVM option.
     * Assertions are typically enabled when an application is being tested and
     * debugged,
     */
    public static void main(String[] args) {


        testAssertions(-11);

    }
}
