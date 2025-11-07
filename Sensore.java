public class Sensore {
    private IP indirizzoIp;
    private int codiceUnivoco;
    private static int incrementoCodice;
    private double qualitaAria;
    private Coordinate coordinate;
    private Data scadenzaBatteria;
    private Data aggiuntaBatteria;

    public void setQualitaAria(double qualitaAria){
        if (qualitaAria >= 0){
            this.qualitaAria = qualitaAria;
        }else {
            this.qualitaAria = -1;
        }
    }

    public void setCoordinate(Coordinate coordinate){
        this.coordinate = coordinate;
    }

    public void setScadenzaBatteria(Data data){
        scadenzaBatteria = data;
    }

    public void setAggiuntaBatteria(Data data){
        aggiuntaBatteria = data;
    }

    public int getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public IP getIndirizzoIp(){
        return indirizzoIp;
    }

    public double getQualitaAria(){
        return qualitaAria;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Data getScadenzaBatteria() {
        return scadenzaBatteria;
    }

    public Data getAggiuntaBatteria() {
        return aggiuntaBatteria;
    }

    public Sensore(IP indirizzoIp){
        this.indirizzoIp = indirizzoIp;
        codiceUnivoco = incrementoCodice++;
        qualitaAria = 0;
        coordinate = new Coordinate();
        scadenzaBatteria = new Data();
        aggiuntaBatteria = new Data(scadenzaBatteria);
        aggiuntaBatteria.setAnno(scadenzaBatteria.getAnno()-1);
    }

    public Sensore(IP indirizzoIp, Coordinate coordinate, Data scadenzaBatteria, Data aggiuntaBatteria){
        this.indirizzoIp = indirizzoIp;
        codiceUnivoco = incrementoCodice++;
        setQualitaAria(0);
        setCoordinate(coordinate);
        setScadenzaBatteria(scadenzaBatteria);
        setAggiuntaBatteria(aggiuntaBatteria);
    }

    public Sensore(Sensore sensoreDaCopiare){
        this(sensoreDaCopiare.indirizzoIp, sensoreDaCopiare.coordinate, sensoreDaCopiare.scadenzaBatteria, sensoreDaCopiare.aggiuntaBatteria);
    }

    public boolean equals(Sensore sensoreDaConfrontare){
        return coordinate.equals(sensoreDaConfrontare.coordinate);
    }

    public String toString(){
        return "Sensore[Codice: " + codiceUnivoco + indirizzoIp + ", Qualita' aria: " + qualitaAria + ", " + coordinate + ", Scadenza batteria: " + scadenzaBatteria + ", Aggiunta batteria: " + aggiuntaBatteria + "]";
    }

    public static String toString(Sensore[] arr){
        String stringa = "ArrSensore[";
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null){
                stringa += arr[i].getIndirizzoIp();
                if (i < arr.length -1){
                    stringa += ", ";
                }
            }
        }
        stringa += "]";
        return stringa;
    }
}
