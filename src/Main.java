public class Main {
    public static void main(String[] args) {

        CarS vaz14 = new CarS("vaz", "14", 1.6);
        CarS prior = new CarS("vaz", "prior", 1.8);
        CarS grant = new CarS("vaz", "grant", 1.4);
        CarS vesta = new CarS("vaz", "vesta", 2.0);
        System.out.println(CarS.PIT_STOP[2]);
        vesta.refill();
        System.out.println("лучшее время круга " + prior.bestLapTime());
        System.out.println("максимальная скорость по объему двигателя автомобиля " + vesta.topSpeed());


        Trucks tankTrucks = new Trucks("scania", "t", 3.0);
        Trucks flatbedTrucks = new Trucks("faw", "f", 4.7);
        Trucks bunkerTrucks = new Trucks("tig500", "d", 5.0);
        Trucks cargoVans = new Trucks("daf", "c", 3.6);
        System.out.println(Trucks.PIT_STOP[1]);
        System.out.println(flatbedTrucks);

        Buses ankai = new Buses("ankai", "kai", 6.9);
        Buses ayats = new Buses("ayats", "a", 4.2);
        Buses baw = new Buses("baw", "b", 3.8);
        Buses daewoo = new Buses("daewoo", "d", 4.3);
        System.out.println(baw.pitStop());
        System.out.println(ayats);

        CarsB <CarS> b = new CarsB<>("Зайцева Маргарита Михайловна", true, "4 года");
        System.out.println(b);


        FreightC <Trucks> c = new FreightC<>("Сергеев Богдан Глебович", false, "7 лет");
        System.out.println(c);


        BusesD<Buses> d = new BusesD<>("Лукьянова Диана Марковна", true, "9 месяцев");
        System.out.println(d);


    }
}