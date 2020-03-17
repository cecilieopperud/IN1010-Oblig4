class TestProgram{
  public static void main(String[] args){
    Pasient pasient = new Pasient(240999, "Cecilie");
    Lege lege = new Lege("Benjamin");
    Vanlig legemiddel = new Vanlig("Ibux", 125, 5);
    //BlaaResept resept = new BlaaResept(legemiddel, lege, pasient, 3);
    Liste<Pasient> pasientliste = new Lenkeliste<Pasient>();
    pasientliste.leggTil(pasient);
    System.out.println(pasientliste.iterator());
  }
}
