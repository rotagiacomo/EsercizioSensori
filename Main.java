public class Main {
    public static void main(String[] args){
        Sensore a = new Sensore();
        Sensore b = new Sensore();
        Sensore c = new Sensore();
        Server primo = new Server();
        primo.aggiungiSensore(a);
        primo.aggiungiSensore(b);
        primo.aggiungiSensore(c);
        System.out.println(primo);
        primo.rimuoviSensore(b.getIndirizzoIp());
        primo.rimuoviSensore(a.getIndirizzoIp());
        System.out.println(primo);
    }
}
