import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1, ProductionRemoteControlCar prc2) {
        switch (prc1.compareTo(prc2)) {
            case 0: case 1:
                return List.of(prc1, prc2);
            case -1:
                return List.of(prc2, prc1);
            default:
                return List.of(prc1, prc2);
        }
                                            
    }
}
