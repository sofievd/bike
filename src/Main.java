import java.util.ArrayList;

public class Main {
    public static ArrayList<BikeImpl> allBikes;
    public static void main(String[] args) {
        allBikes = new ArrayList<>();
        BikeImpl cityBike = new Citybike();
        BikeImpl mountainBike = new Moutainbike("tut tut tut", "Stockholm Central Station");
        BikeImpl electricBike = new Electricbike("tooooooooooot");
        BikeImpl foldningBike = new Foldnigbike();
        BikeImpl singleSpeedBike = new SingleSpeedBike();

        allBikes.add(cityBike);
        allBikes.add(mountainBike);
        allBikes.add(electricBike);
        allBikes.add(foldningBike);
        allBikes.add(singleSpeedBike);

        ringBell();
        turnOnLight();

    }

    public static void turnOnLight(){
        for (BikeImpl bike : allBikes){
            bike.lysa();
        }
    }

    public static void ringBell(){
        for(BikeImpl bike: allBikes){
            bike.plinga();
        }
    }
}
