package Lesson02;


public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] Arr = new String[][]{{"1", "10", "6", "18"}, {"78", "91", "85", "88"}, {"35", "7", "92", "8"}, {"67", "2", "45", "96"}};
        System.out.println ("Сумма массива Arr " + arrSum (Arr));
    }

    public static int arrSum(String[][] Arr) throws MyArraySizeException, NumberFormatException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr.length != 4) throw new MyArraySizeException ("Arr[" + (i + 1) + "]");
            //   System.out.println ( );
            for (int j = 0; j < Arr[i].length; j++) {
                if (Arr[i].length != 4) throw new MyArraySizeException ("Arr[" + (i + 1) + "][" + (j + 1) + "]");
                try {
                    sum += Integer.parseInt (Arr[i][j]);
                    //     System.out.println (sum );
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException ("Arr[" + (i + 1) + "][" + (j + 1) + "]");
                } finally {

                }
            }
        }
        return sum;
    }
}
//        1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
//        при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
//        Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
//        должно быть брошено исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
//        3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.