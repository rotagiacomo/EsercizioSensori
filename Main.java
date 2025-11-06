public class Main {
    public static void main(String[] args){
        Sensore a = new Sensore();
        Sensore b = new Sensore();
        Sensore c = new Sensore();
        Server server = new Server();
        server.aggiungiSensore(a);
        Sensore[] agg = new Sensore[5];
        agg[0] = b;
        agg[1] = c;
        server.aggiungiSensore(agg);
        System.out.println(server);
        Sensore[] inArea = server.sensoriInArea(new Coordinate(10, 10), new Coordinate(10, 10));
        System.out.println(Sensore.toString(inArea));
    }
}
