public class Main {
    public static void main(String[] args) {
        double tuition = 10000;
        double percentageIncrease = 0.05;
        double years = 1;
        double totalTuition = 0;

        for (int year = 1; year <= 10; year++) {
            tuition *= (1 + percentageIncrease);

        }
        double formatTuition = Math.round(tuition*100.0)/100.0;
        System.out.print("Tuition after 10 years is: $" + formatTuition + "\n");

        while (years <= 4) {
            totalTuition += tuition;
            tuition *= (1 + percentageIncrease);
            years++;
        }
        double formatTotalCost = Math.round(totalTuition*100.0)/100.0;
        System.out.print("The total 4 year cost is: $" + formatTotalCost);
    }
}