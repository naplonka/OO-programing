package access_modifieres.non_access_modifier;
//w metodach statycznych mie można używać zmiennych instacji
// w metodach instancji można uzywać zmiennych statycznych
// final satic - final tzn że nie chcemy żeby była dziedziczona i zmieniana, static oznacza class level varieble
// static final nigdy się nie zmieni, nie chcemy żeby ktoś to zmienił

class Player {
    private String name;//zmienna instacji
    private static int count = 0;

    public Player(String name) {
        super();
        this.name = name;
        count++;
    }

    static public int getCount() {
        return count;
    }

    public String getName() {// to jest motoda instancji
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class StaticModifierRunner {
    public static void main(String[] args) {
        Player player1 = new Player("Ronaldo");
        Player player2 = new Player("Rederer");
//        System.out.println(player1.getCount());
//        System.out.println(player2.getCount());
        System.out.println(Player.getCount());//jeżeli metoda będzie static możemy użyć tylko Player.getCount, nie musimy player1.getCount
        System.out.println(Player.getCount());//można użyć player1.getCount (czyli instancji) ale nie jest to zalecane to mwtod statycznych
    }


}
