public class Sensore {
    private IP indirizzoIp;
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

    public Sensore(){
        indirizzoIp = new IP();
        qualitaAria = 0;
        coordinate = new Coordinate();
        scadenzaBatteria = new Data();
        aggiuntaBatteria = new Data(scadenzaBatteria);
        aggiuntaBatteria.setAnno(scadenzaBatteria.getAnno()-1);
    }

    public Sensore(double qualitaAria, Coordinate coordinate, Data scadenzaBatteria, Data aggiuntaBatteria){
        indirizzoIp = new IP();
        setQualitaAria(qualitaAria);
        setCoordinate(coordinate);
        setScadenzaBatteria(scadenzaBatteria);
        setAggiuntaBatteria(aggiuntaBatteria);
    }

    public Sensore(Sensore sensoreDaCopiare){
        this(sensoreDaCopiare.qualitaAria, sensoreDaCopiare.coordinate, sensoreDaCopiare.scadenzaBatteria, sensoreDaCopiare.aggiuntaBatteria);
    }

    public boolean equals(Sensore sensoreDaConfrontare){
        return indirizzoIp.equals(sensoreDaConfrontare.indirizzoIp) && coordinate.equals(sensoreDaConfrontare.coordinate) && scadenzaBatteria.equals(sensoreDaConfrontare.scadenzaBatteria) && aggiuntaBatteria.equals(sensoreDaConfrontare.aggiuntaBatteria);
    }

    public String toString(){
        return "Sensore[" + indirizzoIp + ", Qualita' aria: " + qualitaAria + ", " + coordinate + ", Scadenza batteria: " + scadenzaBatteria + ", Aggiunta batteria: " + aggiuntaBatteria + "]";
    }
}
