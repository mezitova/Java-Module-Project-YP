import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Car> cars = new ArrayList<>(n);
        start(n, cars);
        //System.out.println(cars);
        Race race = new Race();
        Car winnerCar = race.calculateWinner(cars);
        System.out.printf("Самая быстрая машина: %s%n", winnerCar.name);


    }

    public static void start(int n, ArrayList<Car> cars) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            String name;
            boolean isIncorrect;
            do {
                System.out.printf("— Введите название машины №%d%n", i + 1);
                name = scanner.nextLine();
                isIncorrect = name.isEmpty();
                if (isIncorrect) {
                    System.out.println("Некорректный ввод. Повторите.");
                }
            } while (isIncorrect);

            double speed = -1;
            boolean outOfBounds;
            boolean isNotANumber;
            do {
                System.out.printf("— Введите скорость машины №%d%n", i + 1);
                if (scanner.hasNextDouble()) {
                    isNotANumber = false;
                    speed = Double.parseDouble(scanner.nextLine());
                    outOfBounds = (speed < 0 || speed > 250);
                } else {
                    isNotANumber = true;
                    outOfBounds = false;
                }
                if (outOfBounds || isNotANumber) {
                    System.out.println("Неправильная скорость");

                }

            } while (outOfBounds || isNotANumber);

            Car car = new Car(name, speed);
            cars.add(car);
        }


    }
}
/* P.S.
После успешного ввода рассчитываем, сколько километров за 24 часа смог проехать
каждый участник гонки (автомобиль), и запоминаем лидера.

- т.к. в фразе "После успешного ввода рассчитываем," не написано уточнение "после каждого успешного ввода",
мое решение отличается от "Подробная подсказка и алгоритм решения".
И не было рекомендаций выбрать алгоритм максимально эффективный по памяти или масштабируемый, поэтому решила
использовать список для хранения данных.

 */