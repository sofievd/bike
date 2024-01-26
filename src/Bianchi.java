public class Bianchi implements navigationImpl {
    private int id;

    public Bianchi(int id) {
        this.id = id;
    }


    @Override
    public void useGPS() {
        System.out.println("Bianchi has a GPS.");
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}
