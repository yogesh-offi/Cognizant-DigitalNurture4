public class App {

    public static double predictValue(int year, double currentValue, double growthRate) {
        if (year == 0) {
            return currentValue; 
        }
        return predictValue(year - 1, currentValue, growthRate) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double currentValue = 10000;
        double growthRate = 0.08;
        int years = 5;

        double predicted = predictValue(years, currentValue, growthRate);
        System.out.printf("Predicted value after %d years: ₹%.2f%n", years, predicted);
    }
}
