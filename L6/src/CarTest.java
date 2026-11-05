public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(100, 500, 20);
        Car car2 = new Car(100, 600, 15);
        double car1Consumption = car1.computeConsumption();
        double car2Consumption = car2.computeConsumption();
        System.out.println(car1Consumption + " " + car2Consumption);
    }
}
