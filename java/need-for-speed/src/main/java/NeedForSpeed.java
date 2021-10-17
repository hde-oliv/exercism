class NeedForSpeed {
    int speed;
    int distanceDriven;
    int batteryDrain;
    int batteryRemaining = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryRemaining == 0 ? true : false;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.batteryRemaining -= this.batteryDrain;
            this.distanceDriven += this.speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        return distance - (car.speed * car.batteryRemaining / car.batteryDrain) <= 0 ? true : false;
    }
}
