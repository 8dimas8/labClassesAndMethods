package Package;

// create class
class Building {
    private int numFloors;
    private int length;
    private int width;

// use constructor
    Building(int numFloors, int length, int width){
        this.numFloors = numFloors;
        this.length = length;
        this.width = width;
    }

    // void method
    void heightFire(){
        System.out.println("Висота становить" + " " + numFloors * width + "м");
    }// визначає висоту будівлі

// return method
    int squareFire(){
        return numFloors * length * width;
    }// площа стін будівлі

// parameter method
    void ladder(int floors, int height){// в залежності від висоти визначає тип драбини яку потрібно використати
        int flHeight = floors * height;
        if (flHeight < 3.5){
            System.out.println("Ви можете використати драбину палку");
        }
        else if (flHeight < 10.7){
            System.out.println("Ви можете застосувати трьохколінну висувну драбину");
        }
        else {
            System.out.println("Вам потрібна автодрабина");
        }
    }

    // перевантажений
    // витрата піни на гасіння пожежі
    void cost(int a, int b) {// обсяг, що заповнюється піною час гасіння, час гасіння
        System.out.println("Витрата піни на гасіння пожежі" + " " + (a * 2.25)/b + " " + "куб.м/хв" );
    }

    WaterTime waterTime = new WaterTime(4000,2,7);
    Fuel fuel = new Fuel(4,5,4);
    int volumeTank = waterTime.getVolumeTank();
    int countN = waterTime.getCountN();
    int waterSupply = waterTime.getWaterSupply();

    // diff class method
    void maxPowerFuel(){// витрата палива в режимі навантаження

    }

    // get() and set()
    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
