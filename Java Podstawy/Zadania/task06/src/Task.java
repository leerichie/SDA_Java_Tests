import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Robota skończona");
        } else {
            int totalA = 0;
            for (int i = a; i <= b; i++) {
                totalA += i;
            }
            System.out.println(totalA);
        }
    }
}