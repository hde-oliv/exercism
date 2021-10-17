public class ElonsToyCar {
    private int metersDriven;
    private int batteryRemaining = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + metersDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryRemaining != 0) {
            return "Battery at " + batteryRemaining + "%";
        }
        return "Battery empty";
    }

    public void drive() {
        if (batteryRemaining != 0) {
            this.metersDriven += 20;
            this.batteryRemaining--;
        }
    }
}
