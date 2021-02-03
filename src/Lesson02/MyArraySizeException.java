package Lesson02;

public class MyArraySizeException extends Exception {
    public MyArraySizeException (String message) {
        super("Массив " + message + " неверного размера!");
    }
}
