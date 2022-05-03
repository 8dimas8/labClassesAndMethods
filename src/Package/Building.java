package Package;
// create class
class Building {
    int numFloors;
    int length;
    int width;
// use constructor
    Building(int numFloors, int length, int width){
        this.numFloors = numFloors;
        this.length = length;
        this.width = width;
    }
    // void method
    void heightFire(){
        System.out.println("Висота становить" + " " + numFloors * width + "м");
    }
// return method
    int squareFire(){
        return numFloors * length * width;
    }
// parameter method
    void ladder(int floors, int height){
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

}
