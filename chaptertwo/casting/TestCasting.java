package chaptertwo.casting;

class Animal {
    public void sound() {
        System.out.println("sound from animal");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("sound from dog");
    }

    public void name() {
        System.out.println("name of dog");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        if (animal instanceof Dog) {
            ((Dog) animal).name();
        }
    }
}
