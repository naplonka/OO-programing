package exeption;

import java.util.Scanner;

public class TryWithResourcesRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){//nie trzeba zamykać, scanner się zapyka na koniec kompilacji, posiada AutoClosable
            int[] numbers = {23,44,55};
            int number = numbers[21];

        }
    }
}
/*Możesz dodawać blok exeptionów
try {
} catch (IOExcetion | SQLException ex) {
ex.printStackTrace();
}

Good Practices:
Never Hide Exception
Nie używać flow control
Myśleć o użytkowniku
Myśleć o innych programistach
Myśleć o nazywaniu metod

*/
