package chaptersix.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatch {

    public static void main(String[] args) {
        try {
            throw new IOException("io");
        } catch (IOException e) {
            e = new IOException();
        } catch (ArithmeticException | NullPointerException e) {
//            e = new IOException();
        }
    }
}
