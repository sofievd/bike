public class Citybike implements BikeImpl, NavigationImpl{
      private static final String sound = "tuut";

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
        System.out.println(ANSI_RED + "Slowing down" + ANSI_RESET);

    }

    @Override
    public void lysa() {
        System.out.println(ANSI_YELLOW + "litle light" + ANSI_RESET);
    }

    @Override
    public void useGPS() {
        System.out.println(ANSI_PURPLE + "No GPS available" + ANSI_RESET);
    }

    @Override
    public void turnLeft() {
        System.out.println(ANSI_PURPLE + "sharp turn left"+ ANSI_RESET);
    }

    @Override
    public void turnRight() {
        System.out.println(ANSI_PURPLE + "sharp turn right"+ ANSI_RESET);

    }
}
