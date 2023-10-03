package chapterone.enums;

public class AnimalSound {
    static Animal animal;
    public static void main(String[] args) {
        System.out.println(animal.DOG.sound +" "+animal.FISH.sound);
    }
}

enum Animal {
    DOG("WOOF"), CAT("meow"), FISH("burble");
    String sound;

    Animal(String s) {
        sound = s;
    }
}
