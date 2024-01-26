/*
 * SingeSpeedbike
 *
 *
 *Sofie Van Dingenen
 *
 * V.1 2024-01-26
 *
 * */
public class SingleSpeedBike implements BikeImpl, Repairable{
    private static final String sound = " tut tuut";

    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_PURPLE = "\u001B[35m";


    @Override
    public void plinga() {
        System.out.println(ANSI_CYAN + sound + ANSI_RESET);
    }

    @Override
    public void bromsa() {
        System.out.println(ANSI_RED + "slowing down" + ANSI_RESET);

    }

    @Override
    public void lysa() {
        System.out.println(ANSI_YELLOW + "lilte ligth" + ANSI_RESET);

    }

    @Override
    public void pumpa() {
        System.out.println(ANSI_PURPLE + "pumping tires" + ANSI_RESET);

    }

    @Override
    public void smorja() {
        System.out.println(ANSI_PURPLE + "oil chain" + ANSI_RESET);
    }

    @Override
    public void slangbyta() {
        System.out.println(ANSI_PURPLE + " changing tire"+ ANSI_RESET);
    }
}
