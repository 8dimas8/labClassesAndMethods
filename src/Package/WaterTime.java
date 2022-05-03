package Package;
// create class
class WaterTime {
    int volumeTank;
    int countN;
    int waterSupply;
    // use constructor
    WaterTime(int volumeTank, int countN, int waterSupply) {
        this.volumeTank = volumeTank;
        this.countN = countN;
        this.waterSupply = waterSupply;
    }
    // void
    void waterUse() {
        System.out.println("Води в цистерні вистачить на" + " " + (volumeTank / (countN * waterSupply * 60) + "хв"));
    }
    // return
    int waterRef() {
        return volumeTank / (waterSupply * 60);}
    // parameter
    int roadToWater(int way, int averageSpeed){
        int time = (way/averageSpeed) * 60;
        return time;
    }

    void varEquipment(int... arr){
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


}