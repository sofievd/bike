public class BMX implements Repairable, BikeImpl, navigationImpl{



    private int id;

    public BMX(int id) {
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

    @Override
    public void pumpa() {

    }

    @Override
    public void smorja() {
        System.out.println("BMX är välsmörjat");
    }

    @Override
    public void slangbyta() {

    }

    @Override
    public void useGPS() {
        System.out.println("BMX cykeln har ingen GPS.");
    }

    @Override
    public void turnLeft() {
        System.out.println("Cykelstyret vänder till vänster bra.");
    }

    @Override
    public void turnRight() {
        System.out.println("Cykelstyret vänder till höger bra.");
    }
}
