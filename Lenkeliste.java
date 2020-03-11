public class Lenkeliste<T> implements Liste<T>{

  public class Node{
    T verdi;
    Node neste = null;

    Node(T v){
      verdi = v;
    }
  }

  public class LenkelisteIterator implements Iterator<T>{

    @Override
    public boolean hasNext(){
    }

    @Override
    public T next(){

    }
  }

  public Node start = new Node(null);

  public Iterator iterator(){
    LenkelisteIterator ny = new LenkelisteIterator();
    return ny;
  }


  public void leggTil(T v){
    if (start.neste == null){
      start.neste = new Node(v);
    }
    else {
      Node denneNoden = start;
      while (denneNoden.neste != null){
        denneNoden = denneNoden.neste;
      }
      denneNoden.neste = new Node(v);
    }
  }


  public void leggTil(int pos, T v){
    if(pos<0 || pos > this.stoerrelse()){
      throw new UgyldigListeIndeks(pos);
    }
    if (pos == 0){
      Node nodePaaPos = new Node(v);
      nodePaaPos.neste = start.neste;
      start.neste = nodePaaPos;
    }
    else{
      Node nodePaaPos = start;
      for (int i = 0; i < pos; i++){
        nodePaaPos = nodePaaPos.neste;
      }
      Node ny = new Node(v);
      ny.neste = nodePaaPos.neste;
      nodePaaPos.neste = ny;
    }
  }


  public void sett(int pos, T v){
    if(pos<0 || pos>=this.stoerrelse()){
      throw new UgyldigListeIndeks(pos);
    }
    Node nodeBeholder = start;
    for (int i = 0; i < pos; i++){
      nodeBeholder = nodeBeholder.neste;
    }
    nodeBeholder.neste.verdi = v;
  }



  // tar ut første element i lista
  public T fjern(){
    if(start.neste == null){
      throw new UgyldigListeIndeks(-1);
    }
    else{
      start = start.neste;
      return start.verdi;
    }
  }


  public T fjern(int pos){
    if(pos<0 || pos>=this.stoerrelse()){
      throw new UgyldigListeIndeks(pos);
    }
    Node nodePaaPos = start;
    for (int i= 0; i < pos; i++){
      nodePaaPos = nodePaaPos.neste;
    }
    Node fjern = nodePaaPos.neste;
    nodePaaPos.neste = fjern.neste;
    return fjern.verdi;
  }


  public int stoerrelse(){
   Node p = start;
   int n = 0;
   while (p.neste != null){
     n++;
     p = p.neste;
   }
   return n;
}


  public T hent(int pos){
    if(pos < 0 || pos >= this.stoerrelse()){
      throw new UgyldigListeIndeks(pos);
    }
    Node nodePaaPos = start.neste;
    for (int i= 0; i < pos; i++){
      nodePaaPos = nodePaaPos.neste;
    }
    return nodePaaPos.verdi;
  }
}
