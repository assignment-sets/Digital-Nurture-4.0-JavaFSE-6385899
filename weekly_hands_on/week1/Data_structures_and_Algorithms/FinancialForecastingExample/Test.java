public class Test {
    public static void main(String[] args) {
        try {
            int numOfYrs = 5;
            String projectedRevenue = RevenuePredictor.predictRevenue("2500000", "7.2", numOfYrs);
            System.out.println(String.format("projected reveneue for %d years is : %s", numOfYrs, projectedRevenue));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
