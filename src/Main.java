public class Main {
    public static void main(String[] args) {

        Repairable BMX = new BMX(1);
        Repairable Fuji = new Fuji(2);

        checkRepairStatus(BMX);
        checkRepairStatus(Fuji);

    }
    public static void checkRepairStatus (Repairable r) {
            r.pumpa();
        }

}
