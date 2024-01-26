public record ElectricBike(String name) implements BikeImpl, Repairable,
        navigationImpl {


    @Override
    public String plinga() {
        System.out.println("pling...pling...");
        return null;
    }

    @Override
    public void bromsa() {
        System.out.println("slowing down...");
    }

    @Override
    public void lysa() {
        System.out.println("lighting up the road...");
    }

    @Override
    public void pumpa() {
        System.out.println("pumping the tires...");
    }

    @Override
    public void smorja() {
        System.out.println("greasing the chain...");
    }

    @Override
    public void slangbyta() {
        System.out.println("no more flat tire!");
    }

    @Override
    public void useGPS() {
        System.out.println("Using the GPS");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("Turning right");
    }

    public boolean isMoving() {
        return true;
    }

    public Object getFlatTireStatus() {
        return null;
    }
}
