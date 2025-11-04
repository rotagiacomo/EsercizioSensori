public class IP {
    private int[] indirizzo;
    private static int[] incrementoIP = {0,0,0,-1};

    private int[] assegnaIP(){
        for (int i = 3; i>=0; i--){
            if(incrementoIP[i] < 255){
                incrementoIP[i]++;
                break;
            }else {
                if (incrementoIP[0] == 255 && incrementoIP[0] == incrementoIP[1] && incrementoIP[1] == incrementoIP[2] && incrementoIP[2] == incrementoIP[3]){
                    return new int[]{-1};
                }
                incrementoIP[i] = 0;
            }
        }
        return incrementoIP;
    }

    public IP(){
        indirizzo=assegnaIP();
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
