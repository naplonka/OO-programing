package tipsandtrics;

import java.math.BigDecimal;
import java.util.ArrayList;

import static java.lang.System.out;
import static java.util.Collections.sort;

public class ImportRunner {
    public static void main(String[] args) {
        BigDecimal db = null;
        //default class jest importowana java.lang.*;
        out.println("Static import");
        // można także stwrzyć static import dla metody
//        Collections.sort(new ArrayList<String>()); jak mamy import static java.util.Collections.*; nie musimy pisać Collections.sort wystarczy sort
        sort(new ArrayList<String>());
    }
}
