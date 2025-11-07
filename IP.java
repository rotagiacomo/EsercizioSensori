public class IP {
    private int[] indirizzo;

    private boolean isValid(int[] indirizzo){
        if (indirizzo.length != 4) return false;
        for (int i = 0; i<4; i++){
            if (indirizzo[i] < 0 || indirizzo[i] > 255){
                return false;
            }
        }
        return true;
    }

    public IP(int[] indirizzo){
        if (isValid(indirizzo)){
            this.indirizzo = indirizzo;
        }else {
            this.indirizzo = new int[]{-1};
        }
    }

    public int[] getIP(){
        return indirizzo;
    }

    public boolean equals(IP indirizzoDaConfrontare){
        for (int i = 0; i<indirizzo.length; i++){
            if (indirizzo[i] != indirizzoDaConfrontare.indirizzo[i]){
                return false;
            }
        }
        return true;
    }

    public String toString(){
        String stringa = "IP[";
        for (int i = 0; i<indirizzo.length; i++){
            stringa += indirizzo[i];
            if(i < indirizzo.length-1){
                stringa += ".";
            }
        }
        stringa += "]";
        return stringa;
    }
}
