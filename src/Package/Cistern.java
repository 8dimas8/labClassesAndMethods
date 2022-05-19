package Package;

public class Cistern extends WaterTime{
    int water;
    Cistern(int volumeTank, int countN, int waterSupply, int water){
        super(volumeTank,countN,waterSupply);
        this.water = water;
    }
    int countCistern(){
        return water/getVolumeTank();
    }
    void test(){
        Rescuer rescuer = new Rescuer();
        rescuer.countRescuer();
    }
    class Rescuer{
        void countRescuer(){
            System.out.println("Кількість рятувальників становить" + " " + countCistern()*6 + " " + "осіб");
        }
    }

}
