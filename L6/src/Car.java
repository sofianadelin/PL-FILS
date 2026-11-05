public class Car {
    private double startKm;
    private double endKm;
    private double liters;

    public Car(double startOdo, double endOdo, double litersUsed) {
        this.startKm = startOdo;
        this.endKm = endOdo;
        this.liters = litersUsed;
    }

    public double computeConsumption(){
        // 500km => 15 litri, 15/500 = 0.03 * 100 = 3 la suta
        return this.liters / (this.endKm - this.startKm) * 100 ;
    }

    public static void main(String[] args) {
        Car car = new Car(100, 600, 15);
        double fuel = car.computeConsumption();
        System.out.println(fuel);
    }
}
