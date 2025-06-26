import java.math.BigDecimal;
import java.math.RoundingMode;

public class RevenuePredictor {

    public static BigDecimal predict(BigDecimal currentRevenue, BigDecimal growthRate, int numOfYrs) {
        if (numOfYrs < 0) {
            throw new IllegalArgumentException("numOfYrs can't be negative");
        } else if (numOfYrs > 100) {
            throw new IllegalArgumentException("numOfYrs too big (MAX: 100)");
        }

        if (numOfYrs == 0) {
            return currentRevenue;
        }

        BigDecimal multiplier = growthRate.divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP)
                .add(BigDecimal.ONE);
        return predict(currentRevenue, growthRate, numOfYrs - 1).multiply(multiplier);
    }

    public static String predictRevenue(String currentRevenue, String growthRate, int numOfYrs) {
        BigDecimal projectedRevenue = predict(new BigDecimal(currentRevenue), new BigDecimal(growthRate), numOfYrs);
        projectedRevenue = projectedRevenue.setScale(2, RoundingMode.HALF_UP);
        return projectedRevenue.toString();
    }
}
