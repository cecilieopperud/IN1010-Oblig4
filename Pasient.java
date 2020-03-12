//En Pasient er en typisk bruker av resepter. Pasienten har et navn og et
//fødselsnummer-tekststreng. Når en ny pasient registreres skal denne i tillegg få en unik ID.
//Pasienter har også en liste over reseptene de har fått utskrevet. Siden pasienten ofte vil
//bruke en resept kort tid etter at den er utskrevet, bruker vi en Stabel<Resept> til å lagre
//pasientens resepter. Det skal både være mulig å legge til nye resepter og hente ut hele
//reseptlisten.


public class Pasient {
	static int pasientID = 0;
	String fodselsnummer;
	String navn;
	Stabel<Resepter> liste = new Stabel<Resepter>();

	public Pasient(int f, String n){
    	fodselsnummer = Integer.toString(f);
			navn = n;
      	pasientID ++;
    	}

	public String hentFodselsnummer (){
		return fodselsnummer;
		}

	public String hentNavn(){
		return navn;
		}

	public int hentID(){
		return pasientID;
		}

	public void leggTilResept(Resepter r){
		liste.leggPaa(r);
		}

	public Resepter hentResepter(){
		return liste.hentListe();
		}
}
