public class IP {
    private int[] indirizzo;
    private static int[] incrementoIP = {0,0,0,0};

    private void incrementaIP(){
        for (int i = 3; i>=0; i--){
            if(incrementoIP[i] < 255){
                incrementoIP[i]++;
                break;
            }else {
                if (incrementoIP[0] == 255 && incrementoIP[0] == incrementoIP[1] && incrementoIP[1] == incrementoIP[2] && incrementoIP[2] == incrementoIP[3]){
                    incrementoIP = new int[]{-1};
                }
                incrementoIP[i] = 0;
            }
        }
    }

    private void assegnaIP(){
        indirizzo = new int[4];
        for (int i = 0; i<indirizzo.length; i++){
            indirizzo[i] = incrementoIP[i];
        }
    }

    public IP(){
        assegnaIP();
        incrementaIP();
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

    public boolean isSmaller(IP indirizzoDaConfrontare){
        for (int i = 0; i<indirizzo.length; i++){
            if (indirizzo[i] < indirizzoDaConfrontare.indirizzo[i]){
                return true;
            }
        }
        return false;
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
