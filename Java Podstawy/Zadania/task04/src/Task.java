import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double amount = input.nextDouble();
        int numberOfInstallments = input.nextInt();

        if (amount < 100.0 || amount > 10000.0) {
        amount = 5000.0;
        }
        if (numberOfInstallments < 6 || numberOfInstallments > 48) {
        numberOfInstallments = 36;
        }

        double repaymentRate;
        if (numberOfInstallments <= 12) {
            repaymentRate = 0.025;
        } else if (numberOfInstallments <= 24) {
            repaymentRate = 0.05;
        } else {
            repaymentRate = 0.1;
        }

        System.out.println(amount * (1.0 + repaymentRate) / numberOfInstallments);
    }
}