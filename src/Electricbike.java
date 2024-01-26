/*
 * Electricbike
 *
 *
 *Sofie Van Dingenen
 *
 * V.1 2024-01-26
 *
 * */
public class Electricbike implements BikeImpl, NavigationImpl, Repairable{
    private String sound;

    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_PURPLE = "\u001B[35m";

    private static final String ANSI_ORANGE = "\033[0;33m";
    public Electricbike(String sound){
        this.sound = sound;
    }

    @Override
    public void plinga() {
        System.out.println(ANSI_CYAN + sound +ANSI_RESET);
    }

    @Override
    public void bromsa() {
        System.out.println( ANSI_RED + "total stop" +ANSI_RESET);
    }

    @Override
    public void lysa() {
        System.out.println(ANSI_YELLOW + "bright light" + ANSI_RESET);
    }

    @Override
    public void useGPS() {
        System.out.println(ANSI_PURPLE + " No destination set" + ANSI_RESET);
    }

    @Override
    public void turnLeft() {
        System.out.println(ANSI_PURPLE+"turning left"+ ANSI_RESET);
    }

    @Override
    public void turnRight() {
        System.out.println(ANSI_PURPLE+"turning right"+ ANSI_RESET);
    }

    @Override
    public void pumpa() {
        System.out.println(ANSI_ORANGE + "filling tire" + ANSI_RESET);
    }

    @Override
    public void smorja() {
        System.out.println(ANSI_ORANGE + "adding oil to chain" + ANSI_RESET);
    }

    @Override
    public void slangbyta() {
        System.out.println(ANSI_ORANGE + "changing tire" + ANSI_RESET);
    }
}
