package Package;

// create class
class WaterTime {
    private int volumeTank;
    private int countN;
    private int waterSupply;

    // use constructor
    WaterTime(int volumeTank, int countN, int waterSupply) {
        this.volumeTank = volumeTank;
        this.countN = countN;
        this.waterSupply = waterSupply;
    }

    // void
    void waterUse() {//визначає на який час води вистачить в цистерні
        System.out.println("Води в цистерні вистачить на" + " " + (volumeTank / (countN * waterSupply * 60) + "хв"));
    }

    // return
    int waterRef() {//визначає за який час цистерна наповниться водою
        return volumeTank / (waterSupply * 60);}

    // parameter
    int roadToWater(int way, int averageSpeed){// час доїзду до вододжерела
        int time = (way/averageSpeed) * 60;
        return time;
    }

    // dyn
    void varEquipment(int... arr){// визначає на скількох осіб вистачить спорядження
        int min = arr[0];
        for (int elem : arr){
            if (elem <= min){
                min = elem/2;
            }
        }
        System.out.println("Спорядження вистачить на" + " " + min + " " + "осіб");
    }


    // перевизначений  метод
    double roadToWater(double way, double averageSpeed){
        double time = (way/averageSpeed) * 60;
        return time;
    }
    // перевантажений
    // визначає витрату вогнегасних засобів на гасіння пожежі
   void cost(int a, int b) {//величина розрахункового параметра, інтенсивність подачі
       System.out.println("Витрата вогнегасного засобу становитиме" + " " + a * b + "л/c");
   }



    // get() and set()
    public int getVolumeTank() {
        return volumeTank;
    }

    public void setVolumeTank(int volumeTank) {
        this.volumeTank = volumeTank;
    }

    public int getCountN() {
        return countN;
    }

    public void setCountN(int countN) {
        this.countN = countN;
    }

    public int getWaterSupply() {
        return waterSupply;
    }

    public void setWaterSupply(int waterSupply) {
        this.waterSupply = waterSupply;
    }
}