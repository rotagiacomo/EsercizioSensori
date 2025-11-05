public class Server {
    private Sensore[] sensoriRilevati;
    private static int size = 0;

    public void aggiungiSensore(Sensore sensore){
        int indice = trovaIndice(sensore.getIndirizzoIp());
        if(sensoriRilevati[indice] == null || !sensore.getIndirizzoIp().equals(sensoriRilevati[indice].getIndirizzoIp())) {
            if (sensoriRilevati[indice] != null) {
                for (int i = size; i > indice; i--) {
                    sensoriRilevati[i] = sensoriRilevati[i - 1];
                }
            }
            sensoriRilevati[indice] = sensore;
            size++;
        }
    }

    public void aggiungiSensore(Sensore[] sensori){
        for (int i = 0; i<sensori.length && sensori[i] != null; i++){
            aggiungiSensore(sensori[i]);
        }
    }

    private int trovaIndice(IP indirizzo){
        int i = 0;
        while (i<size && sensoriRilevati[i].getIndirizzoIp().isSmaller(indirizzo)){
            i++;
        }
        return i;
    }

    public void rimuoviSensore(IP indirizzo){
        for (int i = 0; i<size; i++){
            if (sensoriRilevati[i].getIndirizzoIp().equals(indirizzo)){
                scalaArrayUno(i);
                size--;
                return;
            }
        }
    }

    private void scalaArrayUno(int indice){ //qui problema
        for (int i = indice; i<size-1; i++){
            sensoriRilevati[i] = sensoriRilevati[i+1];
        }
        sensoriRilevati[size-1] = null;
    }

    public Server(){
        sensoriRilevati = new Sensore[100];
    }

    public Sensore[] getSensoriRilevati() {
        return sensoriRilevati;
    }

    public Server(int numeroSensori){
        if (numeroSensori > 0) {
            sensoriRilevati = new Sensore[numeroSensori];
        }
    }

    public String toString(){
        String stringa = "Server[";
        for (int i = 0; i<size; i++){
            stringa += sensoriRilevati[i].getIndirizzoIp();
            if(i<size-1){
                stringa += ", ";
            }
        }
        stringa += "]";
        return stringa;
    }
}
