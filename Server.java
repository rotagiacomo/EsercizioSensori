public class Server {
    private Sensore[] sensoriRilevati;
    private                  int size = 0;

    public void aggiungiSensore(Sensore sensore){
        if (size == sensoriRilevati.length){
            aumentaLunghezzaArr();
        }
        int indice = trovaIndice(sensore.getCodiceUnivoco());
        if (sensoriRilevati[indice] != null && sensoriRilevati[indice].getCodiceUnivoco() != sensore.getCodiceUnivoco()){
            scalaArrayUno(indice);
        }
        sensoriRilevati[indice] = sensore;
        size++;
    }

    public void aggiungiSensore(Sensore[] sensori){
        for (int i = 0; i<sensori.length && sensori[i] != null; i++){
            aggiungiSensore(sensori[i]);
        }
    }

    private int trovaIndice(int codiceUnivoco){
        int i = 0;
        while (i<size && sensoriRilevati[i].getCodiceUnivoco() < codiceUnivoco){
            i++;
        }
        return i;
    }

    private void aumentaLunghezzaArr(){
        Sensore[] temp = new Sensore[size*2];
        for (int i = 0; i<sensoriRilevati.length; i++){
            temp[i] = sensoriRilevati[i];
        }
        sensoriRilevati = temp;
        temp = null;
    }

    public void rimuoviSensore(int codiceUnivoco){
        int indice = trovaIndice(codiceUnivoco);
        if (sensoriRilevati[indice] != null && sensoriRilevati[indice].getCodiceUnivoco() == codiceUnivoco){
            scalaArrayUno(indice);
            size--;
        }
    }

    private void scalaArrayUno(int indice){ //qui problema
        for (int i = indice; i<size-1; i++){
            sensoriRilevati[i] = sensoriRilevati[i+1];
        }
        sensoriRilevati[size-1] = null;
    }

    public Sensore trovaSensore(int codiceUnivoco){
        int indice = trovaIndice(codiceUnivoco);
        if (sensoriRilevati[indice] != null && sensoriRilevati[indice].getCodiceUnivoco() == codiceUnivoco){
            return sensoriRilevati[indice];
        }else {
            return null;
        }
    }

    public Sensore[] sensoriInArea(Coordinate minime, Coordinate massime){
        Sensore[] lista = new Sensore[size];
        int a = 0;
        for (int i = 0; i<size; i++){
            if (sensoriRilevati[i].getCoordinate().isInArea(minime, massime)){
                lista[a] = sensoriRilevati[i];
                a++;
            }
        }
        return lista;
    }

    public Server(){
        sensoriRilevati = new Sensore[100];
    }

    public Server(int numeroSensori){
        if (numeroSensori > 0) {
            sensoriRilevati = new Sensore[numeroSensori];
        }
    }

    public String toString(){
        String stringa = "Server[";
        for (int i = 0; i<size; i++){
            stringa += sensoriRilevati[i].getCodiceUnivoco() + " " + sensoriRilevati[i].getIndirizzoIp();
            if(i<size-1){
                stringa += ", ";
            }
        }
        stringa += "]";
        return stringa;
    }
}
