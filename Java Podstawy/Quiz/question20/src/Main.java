import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2020, 3, 31);
//        d.plusMonths(1);
        System.out.println(d.plusDays(2));

    }
}