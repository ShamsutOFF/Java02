package Lesson03;

import java.util.*;

public class PhoneBook {
    static Set <Abonent> set = new TreeSet<> ();

    public static void set(String s, int i) {
        set.add( new Abonent (s,i));
    }

    public static void get(String s){
        Iterator<Abonent> iter = PhoneBook.set.iterator();
        while (iter.hasNext()) {
            Abonent a = iter.next ( );
            if (s.equals(a.name) ) System.out.println (a);
        }
    }
}
