v class Naloga10{
    public static void main(String[] args){
        Oseba oce = new Oseba("Frenk", "Grm", 'M', 1973, null, null);
        Oseba mati = new Oseba("Poli", "Grm", 'Z', 1978, null, null);
        Oseba sin = new Oseba("Stane", "Grm", 'M', 2004, oce, mati); 
        System.out.println(sin.vrniIme() + " " + sin.starost(2022) + ", Ali je starejsi od Poli: " + sin.jeStarejsaOd(mati) + ", Ali je brat od Poli: " + sin.jeBratAlitSestraOd(mati) + ", Ime oceta: "  + sin.imeOceta() + ", Ime matere: " + sin.imeMatere());
    }
}