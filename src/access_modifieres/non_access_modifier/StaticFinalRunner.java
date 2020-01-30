package access_modifieres.non_access_modifier;

public class StaticFinalRunner {
    public static final int SCONDS_IN_MINUTES = 60;
    public static final int MINUTES_IN_HOURS = 60;// można użyć jej wszędzie w aplikacji, niezmienna wartość
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

//        System.out.println("main");

        {
            int i;
//            System.out.println("3>2");
//            System.out.println("3>2");
        }
    }
}
