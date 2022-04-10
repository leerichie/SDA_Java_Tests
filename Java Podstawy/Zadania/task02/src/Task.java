import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float tempInCelsius = input.nextFloat();
//        System.out.print("Temp in Celsius: ");
//        tempInCelsius = input.nextFloat();
//        tempInCelsius = tempInCelsius * 1.8f + 32f;
        System.out.print(1.8f * tempInCelsius + 32.0f);

    }
}