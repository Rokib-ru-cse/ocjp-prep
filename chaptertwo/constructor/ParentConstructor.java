package chaptertwo.constructor;

class Parent {
    public Parent(int a) {
        System.out.println("parent constructor");
    }

    {
        System.out.println("parent instance block 1");
    }

    {
        System.out.println("parent instance block 2");
    }

    static {
        System.out.println("parent static block");
    }
}


class Child extends Parent {
    public Child() {
        super(3);
        System.out.println("Child constructor");
    }

    public Child(int a) {
        this();
        System.out.println("Child constructor overloaded");
    }

    {
        System.out.println("Child instance block 1");
    }

    {
        System.out.println("Child instance block 2");
    }

    static {
        System.out.println("Child static block");
    }


    public static void main(String[] args) {
        Child child = new Child(1);

    }
}
