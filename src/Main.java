public class Main {
    public static void main(String[] args) {

        BikeImpl electricBike = new ElectricBike("EBike 2000");
        navigationImpl mountainBike = new MountainBike("Scott x4");
        BikeImpl threeWheel = new ThreeWheeler("Stiga Super");

        fastForward(electricBike);
        stopping(electricBike);

        upTheHill(mountainBike);
        throughTheWoods(mountainBike);

        fastForward(threeWheel);
        stopping(threeWheel);
    }

    public static void fastForward(BikeImpl ebike) {
        ebike.plinga();
        ebike.lysa();

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
