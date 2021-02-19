package Lesson05;

import java.util.Arrays;

public class Main2 {

    static final int SIZE = 100000 ;
    static final int HALF = SIZE / 2 ;
    static float [] arr = new float [ SIZE ];
    static float [] arr2 = new float [ SIZE ];

    public static void main(String[] args) {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
            arr2[i] = 1;
            }
        method01();
        method02();
    }
    public static float method (int a, int b){
        for (int i = a; i <arr.length ; i+=b) {
            arr2[i] = ( float )( arr2 [ i ] * Math . sin ( 0.2f + i / 5 ) * Math . cos ( 0.2f + i / 5 ) *
                    Math . cos ( 0.4f + i / 2 ));
        }
        return 0;
    }

    public static void method01(){
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = ( float )( arr [ i ] * Math . sin ( 0.2f + i / 5 ) * Math . cos ( 0.2f + i / 5 ) *
                    Math . cos ( 0.4f + i / 2 ));
        }
        long b = System.currentTimeMillis();
 //       System.out.print (Arrays.toString (arr));
        System.out.println (b-a);
    }

    public static void method02(){

        long a = System.currentTimeMillis();

        new Thread ( new MyRunnableClass (method (0,4))). start ();
        new Thread ( new MyRunnableClass (method (1,4))). start ();
        new Thread ( new MyRunnableClass (method (2,4))). start ();
        new Thread ( new MyRunnableClass (method (3,4))). start ();

        long b = System.currentTimeMillis();
        System.out.println (b-a);
    }
}


    class MyRunnableClass implements Runnable {
        public MyRunnableClass(float method) {

        }

        @Override
        public void run() {

        }
    }


/*
Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив, например:
2) Заполняют этот массив единицами.
3) Засекают время выполнения: long a = System.currentTimeMillis().
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
5) Проверяется время окончания метода System.currentTimeMillis().
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
Отличие первого метода от второго:
● Первый просто бежит по массиву и вычисляет значения.
● Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и
потом склеивает эти массивы обратно в один.
Пример деления одного массива на два:
● System.arraycopy(arr, 0, a1, 0, h);
● System.arraycopy(arr, h, a2, 0, h).
Пример обратной склейки:
● System.arraycopy(a1, 0, arr, 0, h);
● System.arraycopy(a2, 0, arr, h, h).
Примечание:
System.arraycopy() — копирует данные из одного массива в другой:
System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника,
массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек
копируем)
По замерам времени:
Для первого метода надо считать время только на цикл расчета:
Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и
склейки.

 */