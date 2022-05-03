package Package;
// create class
class Fuel {
    int distanceToFire;
    int returnDistance;
    int workEngine;
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
    void fuelCons(){
        double allFuel = ((distanceToFire + returnDistance) * 0.35) + workEngine * 0.25;
        System.out.println("Витрата палива становить" + " " + allFuel + "л");
    }
// return
    int cisternDistance(){
        return distanceToFire + returnDistance;
    }
    //parameter
    void refueling(int fuel, int distance){
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

}

