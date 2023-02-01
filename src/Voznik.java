class Voznik{
    String znamka = "Opel ";
    String model = "5Hp ";
    int cena = "10000$ ";
    String voznik = "Anže 17let vožnje 31let starosti";
    boolean voznik = true;
    boolean stnje = true;
    String opis() {
        return opel + model + cena;
    } 
    nastaviVoznika() {
        if(voznik == true) {
        System.out.println("V avtu je ze voznik");
        } else {
            voznik = true;
        }
    }
    String trenutniVoznik() {
        return voznik;
    }
    izstopVoznika() {
        voznik = false;
    }
    vzgi() {
        if(voznik == true) {
            stanje = true;
        } else {
            System.out.println("V avtomobilu ni voznika");
        }
    }
    ugasni() {
        if(voznik == true) {
            stanje = false;
        } else {
            System.out.println("V avtomobilu ni voznika");
        }
    }
    boolean premakni() {
        if(stanje == true) {
            return true;
        } else {
            System.out.println("Avto ni vzgan");
        }
    }
}