public class Coordinate {
    private double latitudine;
    private double longitudine;

    public void setLatitudine(double latitudine){
        if (latitudine >= -90 && latitudine <= 90){
            this.latitudine = latitudine;
        }else {
            this.latitudine = 1000;
        }
    }

    public void setLongitudine(double longitudine){
        if (longitudine >= -180 && longitudine <= 180){
            this.longitudine = longitudine;
        }else {
            this.longitudine = 1000;
        }
    }

    public double getLatitudine() {
        return latitudine;
    }

    public double getLongitudine() {
        return longitudine;
    }

    public Coordinate(){
        latitudine = 0;
        longitudine = 0;
    }

    public Coordinate(double latitudine, double longitudine){
        setLatitudine(latitudine);
        setLongitudine(longitudine);
    }

    public Coordinate(Coordinate coordinateDaCopiare){
        this(coordinateDaCopiare.latitudine, coordinateDaCopiare.longitudine);
    }

    public boolean equals(Coordinate coordinateDaConfrontare){
        return latitudine == coordinateDaConfrontare.latitudine && longitudine == coordinateDaConfrontare.longitudine;
    }

    public String toString(){
        return "Coordinate[" + latitudine + ", " + longitudine + "]";
    }
}
