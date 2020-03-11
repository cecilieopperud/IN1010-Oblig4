public class Lege implements Comparable <Lege> { //Oppretter klassen Lege.
  protected String legeNavn; //protected variabel legeNavn slik at den er tilgjengelig for subklasser.
  protected Lenkeliste<Resepter> utskrevedeResepter = new Lenkeliste<Resepter>();

  public Lege(String navn) { //Konstruktoer som tar imot en String navn.
    legeNavn = navn; //settes som verdien til legeNavn.
  }

  public String hentLegeNavn() { //Metode for aa hente legeNavn.
    return legeNavn;
  }

  public String toString() { //Metode for aa returnere en string til utskrift.
    return legeNavn;
  }
  
  @Override 
  public String compareTo(Lege lege){
    return lege.hentLegeNavn().compareTo(legeNavn.hentLegeNavn());
  }
  public Resepter hentUtResepter(){
    return utskrevedeResepter.hentListe();
}
