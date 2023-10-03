package chapterone.modifier.packagetwo;

import chapterone.modifier.packageone.Parent;

public class Child extends Parent {

    public void printParentInsideChild(){
        printParent();
        System.out.println("print Parent Inside Child");
    }
}
