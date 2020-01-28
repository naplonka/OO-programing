package exeption;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    public String toString() {
        return  amount + " " + currency;
    }

    public void add(Amount other) {
        if(this.currency.equals((other.currency))) {
            throw new RuntimeException("Curroencies don't match");
        }
        this.amount = other.amount + this.amount;
    }
}

public class ThowingExceptionRunner {
    public static void main(String[] args) {
        Amount amount = new Amount("USD", 10);
        Amount amount1 = new Amount("EUR", 32);
        amount.add(amount1);
        System.out.println(amount);

    }
}
