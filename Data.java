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

    public int getGiorno() {
        return giorno;
    }

    public int getMese() {
        return mese;
    }

    public int getAnno() {
        return anno;
    }

    public Data(){
        giorno = 1;
        mese = 1;
        anno = 2025;
    }

    public Data(int giorno, int mese, int anno){
        setGiorno(giorno);
        setMese(mese);
        setAnno(anno);
    }

    public Data(Data dataDaCopiare){
        this(dataDaCopiare.giorno, dataDaCopiare.mese, dataDaCopiare.anno);
    }

    public boolean equals(Data dataDaConfrontare) {
        return giorno == dataDaConfrontare.giorno && mese == dataDaConfrontare.mese && anno == dataDaConfrontare.anno;
    }

    public String toString(){
        return "Data[" + giorno + "/" + mese + "/" + anno + "]";
    }
}
