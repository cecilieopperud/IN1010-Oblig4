//En Pasient er en typisk bruker av resepter. Pasienten har et navn og et
//fødselsnummer-tekststreng. Når en ny pasient registreres skal denne i tillegg få en unik ID.
//Pasienter har også en liste over reseptene de har fått utskrevet. Siden pasienten ofte vil
//bruke en resept kort tid etter at den er utskrevet, bruker vi en Stabel<Resept> til å lagre
//pasientens resepter. Det skal både være mulig å legge til nye resepter og hente ut hele
//reseptlisten.


class Pasient {

	static int pasientID = 0;
  String fodselsnummer;
	String navn;
Stabel<Resept> liste = new Stabel<Resept>();

	Pasient(int f, String n){
    	fodselsnummer = Integer.toString(f);
			navn = n;
      pasientID ++;
    }

	hentFodselsnummer(){
		return fodselsnummer;
		}

	hentNavn(){
		return navn;
		}

	hentID(){
		return pasientID;
		}

	public void leggTilResept(Resept r){
		liste.leggPaa(r);
		}

	public Resept hentResepter(){
		liste.hentListe();
		}
	}
