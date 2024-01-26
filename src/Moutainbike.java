/*
* Mountainbike
*
*
*Sofie Van Dingenen
*
* V.1 2024-01-26
*
* */
public class Moutainbike implements BikeImpl, NavigationImpl {
    private String sound;

    private String destination;
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_RED = "\u001B[31m";

    private static final String ANSI_PURPLE = "\u001B[35m";

    public Moutainbike(String sound, String destination){
        this.sound = sound;
        this.destination = destination;
    }
    @Override
    public void plinga() {
        System.out.println(ANSI_CYAN +sound + ANSI_RESET);
    }

    @Override
    public void bromsa() {
        System.out.println(ANSI_RED + "Stopping" + ANSI_RESET);
    }

    @Override
    public void lysa() {
        System.out.println(ANSI_YELLOW + "Bright" + ANSI_RESET);

    }

    @Override
    public void useGPS() {
        System.out.println(ANSI_PURPLE + "Goinng to destination "+ destination + ANSI_RESET);
    }

    @Override
    public void turnLeft() {
        System.out.println(ANSI_PURPLE + "turning left" + ANSI_RESET);

    }

    @Override
    public void turnRight() {
        System.out.println(ANSI_PURPLE + "turning right" + ANSI_RESET);


    }
}
