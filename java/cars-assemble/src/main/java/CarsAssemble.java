public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int idealProduction = speed * 221;
        if (speed >= 1 && speed <= 4){
            return idealProduction * 1.0;
        } else if (speed >= 5 && speed <= 8) {
            return idealProduction * 0.9;
        } else if (speed == 9) {
            return idealProduction * 0.8;
        } else {
            return idealProduction * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double productionPerHour = this.productionRatePerHour(speed);
        return (int) productionPerHour / 60;
    }
}
