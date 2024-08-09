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
        System.out.println(String.format("Самая быстрая машина: %s", winnerCar.name));


    }

    public static void start(int n, ArrayList<Car> cars) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("— Введите название машины №%d", i + 1));
            String name = scanner.nextLine();
            double speed;
            boolean outOfBounds;
            do {
                System.out.println(String.format("— Введите скорость машины №%d", i + 1));

                //double speed = scanner.nextDouble(); // эквивалентно тому, что ниже
                //double speed = Double.parseDouble(scanner.next()); // next считывает до пробела
                //nextLine - считывает до переноса строки

                speed = Double.parseDouble(scanner.nextLine());
                outOfBounds = (speed <= 0 || speed >= 250);
                if (outOfBounds) {
                    System.out.println("Неправильная скорость");
                }

            } while (outOfBounds);

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