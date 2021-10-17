public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped < 5 ? 1 : 0.85;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return this.multiplierPerProductsSold(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double totalSalary = 1000 * multiplierPerDaysSkipped(daysSkipped) + this.bonusForProductSold(productsSold);
        return (int)totalSalary > 2000 ? 2000 : totalSalary;
    } 
}
