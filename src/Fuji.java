public class Fuji implements Repairable{


    private int id;

    public Fuji(int id) {
        this.id = id;
    }


    @Override
    public void pumpa() {
        System.out.println("Fuji-cykeln är pumpat bra");
    }

    @Override
    public void smorja() {

    }

    @Override
    public void slangbyta() {

    }
}
