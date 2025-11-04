public class Data {
    private int giorno;
    private int mese;
    private int anno;

    public void setGiorno(int giorno){
        if (giorno > 0 && giorno <= 31){
            this.giorno = giorno;
        }else {
            this.giorno = -1;
        }
    }

    public void setMese(int mese){
        if (mese > 0 && mese <= 12){
            this.mese = mese;
        }else {
            this.mese = -1;
        }
    }

    public void setAnno(int anno){
        if (anno > 0){
            this.anno = anno;
        }else {
            this.anno = -1;
        }
    }
}
