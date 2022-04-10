import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        for (int i = 1; i<=number; i++){
            while (i % 2 == 1){
                System.out.println(i);
                break;
            }
        }


    }

}