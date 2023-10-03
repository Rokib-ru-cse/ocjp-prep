package chapterone.modifier;

import chapterone.modifier.packagetwo.Child;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        final int b = 20;

        Child child = new Child();
        child.printParentInsideChild();

    }
}
