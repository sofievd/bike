public class Main {
    public static void main(String[] args) {

        BikeImpl electricBike = new ElectricBike("EBike 2000");
        navigationImpl mountainBike = new MountainBike("Scott X4");

        fastForward(electricBike);
        stopping(electricBike);

        upTheHill(mountainBike);
        throughTheWoods(mountainBike);
    }

    public static void fastForward(BikeImpl bike) {
        bike.plinga();
        bike.lysa();
    }

    public static void stopping(BikeImpl bike) {
        bike.bromsa();
    }

    public static void upTheHill(navigationImpl bike) {
        bike.useGPS();
        bike.turnRight();
    }
    public static void throughTheWoods(navigationImpl bike) {
        bike.turnLeft();
        bike.turnRight();
        bike.useGPS();
    }
}
