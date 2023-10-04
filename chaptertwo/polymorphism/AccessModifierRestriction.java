package chaptertwo.polymorphism;

import java.io.IOException;

public class AccessModifierRestriction {

    /**
     * compile time error saying
     * attempting to assign weaker access privileges; was public
     */
//    @Override
//    protected String toString() {
//        return super.toString();
//    }
    @Override
    public String toString() {
        try {
            throw new IOException("xxx");
        } catch (Exception e) {

        }
        return super.toString();
    }

    /**
     * compile time error saying
     * return type java.lang.Object is not compatible with java.lang.String
     */
//    @Override
//    public Object toString() {
//        return super.toString();
//    }
    public static void main(String[] args) {

    }
}


class Test1 {
    public void print() throws RuntimeException {
        System.out.println("sss");
    }
}

class Test2 extends Test1 {

    /**
     * compile time error saying
     * overridden method does not throw java.io.IOException
     */
//    @Override
//    public void print() throws IOException {
//        System.out.println("sss");
//        throw new IOException();
//    }


    /**
     * overriding method can throw narrower or fewer exceptions.
     *
     * */
//    @Override
//    public void print() throws Exception {
//        System.out.println("xxxxxxxxxx");
//    }
}