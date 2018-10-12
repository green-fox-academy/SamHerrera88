public class Main {
    public static void main(String[] args) {
//        Test AC
//    Aircraft ac1 = new F35();
//    Aircraft ac2 = new F16();
//    ac1.refill(5);
//    ac1.getStatus();
//    ac2.refill(100);
//    ac2.getStatus();
//    System.out.println(ac1.getType());
//    System.out.println(ac1.isPriority());

        Carrier carrier1 = new Carrier(300, 500);
        F35 falcon1 = new F35();
        carrier1.addAircraft(falcon1);
        F16 falcon2 = new F16();
        carrier1.addAircraft(falcon2);
        F16 falcon3 = new F16();
        carrier1.addAircraft(falcon3);

        Carrier carrier2 = new Carrier(400, 8000);
        F35 falcon4 = new F35();
        carrier2.addAircraft(falcon4);
        F35 falcon5 = new F35();
        carrier2.addAircraft(falcon5);
        F35 falcon6 = new F35();
        carrier2.addAircraft(falcon6);
        F16 falcon7 = new F16();
        carrier2.addAircraft(falcon7);
        F16 falcon8 = new F16();
        carrier2.addAircraft(falcon8);

        carrier1.fill();
        carrier2.fill();
        carrier1.getStatus();
        carrier2.getStatus();
        carrier1.fight(carrier2);

        carrier1.fill();
        carrier2.fill();
        carrier1.getStatus();
        carrier2.getStatus();
        carrier1.fight(carrier2);

        carrier1.fill();
        carrier2.fill();
        carrier1.getStatus();
        carrier2.getStatus();
        carrier1.fight(carrier2);

        carrier1.getStatus();
        carrier2.getStatus();
    }
}
