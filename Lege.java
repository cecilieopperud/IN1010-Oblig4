public class Lege { //Oppretter klassen Lege.
  protected String legeNavn; //protected variabel legeNavn slik at den er tilgjengelig for subklasser.

  public Lege(String navn) { //Konstruktoer som tar imot en String navn.
    legeNavn = navn; //settes som verdien til legeNavn.
  }

  public String hentLegeNavn() { //Metode for aa hente legeNavn.
    return legeNavn;
  }

  public String toString() { //Metode for aa returnere en string til utskrift.
    return legeNavn;
  }
}
