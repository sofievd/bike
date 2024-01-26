public class Main {
    public static void main(String[] args) {

        BikeImpl electricBike = new ElectricBike("EBike 2000");

        fastForward(electricBike);
        stopping(electricBike);
    }

    public static void fastForward(BikeImpl bike) {
        bike.plinga();
        bike.lysa();
    }

    public static void stopping(BikeImpl bike) {
        bike.bromsa();
    }
}
