import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Elevator elevator = new Elevator(-25, 28);

        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();

            try {
                elevator.move(floor);
            } catch (IllegalArgumentException e) {
                System.out.print(e.getMessage());
            }
        }
    }
}
