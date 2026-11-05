public class FleetTest {
    public static void main(String[] args) {
        Fleet myFleet = new Fleet(100, 600, 15, 200, 700, 30);
        double avg = myFleet.averageConsumption();
        System.out.println(avg);
    }
}
