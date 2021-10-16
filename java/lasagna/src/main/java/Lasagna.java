public class Lasagna {
    private final int MINUTES_IN_OVEN = 40;

    public int expectedMinutesInOven() { return MINUTES_IN_OVEN; }
    public int remainingMinutesInOven(int minutes) { return MINUTES_IN_OVEN - minutes; }
    public int preparationTimeInMinutes(int minutes) { return minutes * 2; }
    public int totalTimeInMinutes(int layers, int time) { return layers * 2 + time; }
}
