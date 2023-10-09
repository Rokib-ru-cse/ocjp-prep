package chaptertwo.constructor;

public class InstanceBlock {

    public InstanceBlock() {
        System.out.println("constructor");
    }

    {
        System.out.println("instance block 1");
    }

    {
        System.out.println("instance block 2");
    }

    static {
        System.out.println("static block");
    }


    public static void main(String[] args) {
        InstanceBlock block = new InstanceBlock();
    }
}
