import java.util.ArrayList;

public class Race {
    //Car winnerCar;
    double winnerDistance = 0;

    public Car calculateWinner(ArrayList<Car> cars) {
        Car winnerCar = cars.get(0);
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).speed * 24 > winnerDistance) {
                winnerDistance = cars.get(i).speed * 24;
                winnerCar = cars.get(i);
            }
        }

        return winnerCar;
    }

}
// Ниже решение без использования winnerDistance.
//public class Race {
//    Car winnerCar;
//    public Car calculateWinner(ArrayList<Car> cars){
//        Car winnerCar = cars.get(0);
//        for(int i = 0; i < cars.size(); i ++){
//            if (cars.get(i).speed > winnerCar.speed){
//                winnerCar = cars.get(i);
//            }
//        }
//
//        return winnerCar;
//    }
//
//}

