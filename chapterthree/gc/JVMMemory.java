package chapterthree.gc;

import java.util.Date;

public class JVMMemory {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total jvm memory " + runtime.totalMemory() / (1024 * 1024));
        System.out.println("Total jvm memory before object creation " + runtime.freeMemory() / (1024 * 1024));

        Date date;
        for (int i = 0; i < 100000; i++) {
            date = new Date();
            date = null;
        }
        System.out.println("Total jvm memory after object creation " + runtime.freeMemory() / (1024 * 1024));
        runtime.gc();
        System.out.println("Total jvm memory after gc " + runtime.freeMemory() / (1024 * 1024));

    }
}
