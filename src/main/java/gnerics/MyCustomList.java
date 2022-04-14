package gnerics;

import java.util.ArrayList;

public class MyCustomList<T> {
    //Jeżeli chcemy żeby były np same liczby robimy public class MyCustomList<T extends Number> { i nie będziemy mogli użyć Stringa
    //T oznacza generyczność
    //Jak stworzyć taka klase gdzie będzie można wywowałać String i Integer
    ArrayList<T> list = new ArrayList<>();

    public void addElemetn(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }


    public T get(int i) {// Deklarujemy że to będzie T cokolwiek
        return list.get(i);
    }
}
