package Package;


// create class
class Fuel {
    private int distanceToFire;
    private int returnDistance;
    private int workEngine;

// use constructor
    Fuel(int distanceToFire, int returnDistance, int workEngine) {
        this.distanceToFire = distanceToFire;
        this.returnDistance = returnDistance;
        this.workEngine = workEngine;
    }

    // перевизначення конструктора
    Fuel() {
        distanceToFire = 0;
        returnDistance = 0;
        workEngine = 0;
    }
    Fuel(int distanceToFire, int returnDistance) {
        this.distanceToFire = distanceToFire;
        this.returnDistance = returnDistance;
    }
    Fuel(int distance){
        distanceToFire = returnDistance = distance;
    }

    // void
    void fuelCons(){// розраховує витрату палива
        double allFuel = ((distanceToFire + returnDistance) * 0.35) + workEngine * 0.25;
        System.out.println("Витрата палива становить" + " " + allFuel + "л");
    }
// return
    int cisternDistance(){
        return distanceToFire + returnDistance;
    }// весь шлях
    //parameter
    void refueling(int fuel, int distance){//в залежності від кількості палива визначає чи можна добратись до пожежі
        if(fuel > distance * 0.35){
            System.out.println("Ви зможете добратись до пожежі");
        }
        else{
            System.out.println("Ви не зможете добратись до місця пожежі");
        }
    }
// перевизначений
    void refueling(double fuel, double distance){
        if(fuel > distance * 0.35){
            System.out.println("Ви зможете добратись до пожежі");
        }
        else{
            System.out.println("Ви не зможете добратись до місця пожежі");
        }
    }





    // get() and set()
    public int getDistanceToFire() {
        return distanceToFire;
    }

    public void setDistanceToFire(int distanceToFire) {
        this.distanceToFire = distanceToFire;
    }

    public int getReturnDistance() {
        return returnDistance;
    }

    public void setReturnDistance(int returnDistance) {
        this.returnDistance = returnDistance;
    }

    public int getWorkEngine() {
        return workEngine;
    }

    public void setWorkEngine(int workEngine) {
        this.workEngine = workEngine;
    }
}

