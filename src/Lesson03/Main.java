package Lesson03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String [] str = new String[] {"Кошка", "Мышь", "Собака", "Волк", "Тигр", "Заяц", "Лиса", "Кошка", "Тигр", "Заяц", "Медведь", "Сова", "Лев", "Кошка", "Собака"};
        Set<String> hashSet = new HashSet<String> (Arrays.asList (str));
        System.out.println (hashSet);

        Map<String, Integer> nuwWords = new HashMap<> ();
        nuwWords.put (str[0], 0);
        System.out.println (nuwWords );
//        for (String s: str) {
//            if (nuwWords.containsKey (s)){
//                nuwWords.put (s,1);
//            }
//            else {
//                nuwWords.put (s, nuwWords.get (s)+1);
//            }
//        }
//        System.out.println (nuwWords );
    }
}



// 1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.
//
// 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи.
// С помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
//
// Желательно как можно меньше добавлять своего, чего нет в задании
// (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес),
// делать взаимодействие с пользователем через консоль и т.д.).
// Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main(), прописывая add() и get()