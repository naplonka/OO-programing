package emun;

import java.util.Arrays;



//Enum mówi jakie warunki ma przyjmować obiekt

public class EnumClassRunner {
    public static void main(String[] args) {
//        Season season; //tworzymy instancje
//        String season = "Winter"; żeby nie tworzyć dziwnych pór roku, tworzymy ENUM
        Season season = Season.SPRING; //bez tworzenia isntancji

        System.out.println(season);
        Season season1 = Season.valueOf("WINTER");
        System.out.println(season1);
        System.out.println(season1.ordinal());// numer porządkowy, nie jest dobrą praktyką uzywani orginal
        System.out.println(season1.getValue());

        System.out.println(Arrays.toString(Season.values()));



    }
}
