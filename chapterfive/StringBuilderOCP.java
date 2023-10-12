package chapterfive;

public class StringBuilderOCP {
    public static void main(String[] args) {
        final int b;
        b = 30;
        final int a = 10;
        int x = 10;
        switch (x) {
            case a:
                System.out.println("a");
                break;
            // java: constant expression required
//            case b:
//                System.out.println("b");
//                break;
        }


        byte b1 = -128;
        switch (b1) {
            case 1:
                System.out.println("can be a byte");
            case (byte) 128:
                System.out.println("can be a byte");
        }
        byte b2 = (byte) 128;
        byte b3 = (byte) -129;

        System.out.println(b2);
        System.out.println(b3);

        StringBuilder builder = new StringBuilder();
        builder.append("a");
        builder.append("b");
        builder.append(true);
        System.out.println(builder);

    }
}
