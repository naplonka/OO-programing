package tipsandtrics;

import java.util.Objects;

class Client {
    private int id;

    public Client(int id) {
        super();
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id;
    }

    @Override
    public int hashCode() {//dystrybuuje objekty do koszyków równomiernie. Jeżeli wartości są równe hashCode również będzie równy, hashCode się nie zmienia chyba że wartośc obiektu się zmieni
        return Objects.hash(id);
    }
}

public class EqualsRunner {
    public static void main(String[] args) {
        Client c1 = new Client(1);
        Client c2 = new Client(1);

        System.out.println(c1.equals(c2));// output będzie false ponieważ obiekty nie są sobie równe, mają inne memory location, to jest sprawdzane by default
        //jeżeli w klasie Client wygenerujemy equals wtedy porównywane są wartości, rzeczywiste
    }
}
