public class Main {
    public static void main(String[] args){
        System.out.println("Creo un server e un sensore che aggiungo al server");
        Sensore a = new Sensore(new IP(new int[]{100,5,22,1}), new Coordinate(-30, 10), new Data() , new Data());
        Server server = new Server(2);
        server.aggiungiSensore(a);
        System.out.println(server);

        System.out.println();
        System.out.println("Aggiungo un array di sensori al server");
        Sensore[] agg = new Sensore[5];
        Sensore b = new Sensore(new IP(new int[]{2}));
        Sensore c = new Sensore(new IP(new int[]{222,244,1,1}), new Coordinate(10, 5), new Data(), new Data());
        Sensore d = new Sensore(new IP(new int[]{1,0,0,0}), new Coordinate(5, 100), new Data(), new Data());
        agg[0] = c;
        agg[1] = d;
        server.aggiungiSensore(b);
        server.aggiungiSensore(agg);
        System.out.println(server);

        System.out.println();
        System.out.println("Rimuovo un sensore dal server");
        server.rimuoviSensore(b.getCodiceUnivoco());
        System.out.println(server);

        System.out.println();
        System.out.println("Trovo un sensore dal codice univoco");
        System.out.println(server.trovaSensore(2));

        System.out.println();
        System.out.println("Trovo sensori in una area");
        Sensore[] lista = server.sensoriInArea(new Coordinate(-5, -10), new Coordinate(30, 60));
        System.out.println(Sensore.toString(lista));
    }
}
