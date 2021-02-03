package Lesson02;

public class MyArrayDataException extends Exception{
    public MyArrayDataException (String message) {
        super("В ячейке " + message + " не число!");
    }
}
