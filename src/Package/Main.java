package Package;

class Main {
    public static void main(String[] args){
        WaterTime water = new WaterTime(4000,2,7);
        // перевизначення конструктора
        // 3 аргументи
        Fuel fuel = new Fuel(4,5,4  );
        // без агрументів
        Fuel fuel1 = new Fuel();
        // 1 аргумент
        Fuel fuel2 = new Fuel(10);
        // 2 аргументи
        Fuel fuel3 = new Fuel(5,8);
        Building building = new Building(5,3,20);
        int lenBuilding = building.getLength();
        int num = water.getCountN();

        // WaterTime
        water.waterUse();
        System.out.println("Цистерна наповниться за" + " " + water.waterRef() + "хв");
        System.out.println("Дорога до вододжерела займе" + " " + water.roadToWater(60,60) + "хв");
        // перевизначений
        System.out.println("Дорога до вододжерела займе" + " " + water.roadToWater(30.5,30.5) + "хв");
        System.out.println("<---->");

        // Fuel;
        fuel.fuelCons();
        System.out.println("Пройдений шлях складає" + fuel.cisternDistance() + " " + "км");
        fuel.refueling(60,60);
        // перевизначений
        fuel.refueling(30.9,150.6);
        System.out.println("<---->");

        // Building
        building.heightFire();
        System.out.println("Площа ушкоджених стін будівлі" + " " + building.squareFire() + "м.кв");
        building.ladder(3,3);
        System.out.println("<---->");

        //variable
        water.varEquipment(8,9,10);

        // перевантаження
        water.cost(30,4);
        building.cost(400,40);
        System.out.println("<---->");

        // наслідування
        Cistern cistern = new Cistern(4000,5,4,40000);
        cistern.test();
    }
}
