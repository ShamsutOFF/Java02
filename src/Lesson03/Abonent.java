package Lesson03;

public class Abonent implements Comparable<Abonent> {
    String name;
    Integer phoneNumber;

    public Abonent(String name, Integer phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public int compareTo(Abonent o) {
 //       int rez = this.name.compareTo (o.name);
        if (this.name.compareTo (o.name) == 0) return this.phoneNumber-o.phoneNumber;
        else return this.name.compareTo (o.name);
    }

    @Override
    public String toString() {
        return "Абонент " + name +
                " Телефон: " + phoneNumber;
    }
}
