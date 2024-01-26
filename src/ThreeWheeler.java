public record ThreeWheeler(String name) implements BikeImpl, navigationImpl, Repairable {

    @Override
    public void plinga() {
        System.out.println("Meep..meep..");
    }

    @Override
    public void bromsa() {
        System.out.println("feet scraping the ground...");
    }

    @Override
    public void lysa() {
        System.out.println("Oops there is no light...");
    }

    @Override
    public void pumpa() {
        System.out.println("no need, plastic wheels...");
    }

    @Override
    public void smorja() {
        System.out.println("greasing the wheels");
    }

    @Override
    public void slangbyta() {
        System.out.println("Huh what?!");
    }

    @Override
    public void useGPS() {
        System.out.println("what is that?");
    }

    @Override
    public void turnLeft() {
        System.out.println("slowly turning left...");
    }

    @Override
    public void turnRight() {
        System.out.println("A real slow right turn...");
    }
}
