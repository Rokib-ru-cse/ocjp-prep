package chaptertwo.polymorphism;

class Animal {
    public void eat() throws Exception {
        System.out.println("eat from Animal");
    }
}

/**
 *This creates a conflict because in Java, an overriding method cannot throw broader exceptions than the overridden method. In this case, the overriding method in Dog throws no exceptions, which is considered narrower than the superclass method that declares an exception. This is why you get a compile-time error.
 *
 * */
class Dog extends Animal {
    public void eat() {
        System.out.println("eat from child");
    }

    public static void main(String[] args){
        Animal a = new Dog();
        Dog d = new Dog();
        d.eat();
//        a.eat();
    }
}
