public class Cannondale implements BikeImpl{

    private int id;

    public Cannondale(int id) {
        this.id = id;
    }

    @Override
    public void plinga() {
        System.out.println("BMX kan plinga");
    }

    @Override
    public void bromsa() {
        System.out.println("BMX broms är fungerande");
    }

    @Override
    public void lysa() {
        System.out.println("BMX lampan lyser bra");
    }

}
