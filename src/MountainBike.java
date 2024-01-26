public record MountainBike(String name) implements BikeImpl, navigationImpl {


    @Override
    public void plinga() {
        System.out.println("Brrr..brrr..");
    }

    @Override
    public void bromsa() {
        System.out.println("Screeching brakes...");
    }

    @Override
    public void lysa() {
        System.out.println("lighting up the woods...");
    }

    @Override
    public void useGPS() {
        System.out.println("...where is that path??");
    }

    @Override
    public void turnLeft() {
        System.out.println("tight left turn...");
    }

    @Override
    public void turnRight() {
        System.out.println("tight right turn...");
    }
}
