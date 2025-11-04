import java.util.Date;

public class Sensore {
    private IP indirizzoIp;
    private Coordinate coordinate;
    private Date scadenzaBatteria;
    private Date aggiuntaBatteria;

    public void setCoordinate(Coordinate coordinate){
        this.coordinate = coordinate;
    }

    public void setScadenzaBatteria(Date data){
        scadenzaBatteria = data;
    }

    public void setAggiuntaBatteria(Date data){
        aggiuntaBatteria = data;
    }

    public IP getIndirizzoIp(){
        return indirizzoIp;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Date getScadenzaBatteria() {
        return scadenzaBatteria;
    }

    public Date getAggiuntaBatteria() {
        return aggiuntaBatteria;
    }

    public Sensore(){
        indirizzoIp = new IP();
        coordinate = new Coordinate();
        scadenzaBatteria = new Date();
    }

    public String toString(){
        return "Sensore[" + indirizzoIp + ", " + coordinate + ", " + scadenzaBatteria + "]";
    }
}
