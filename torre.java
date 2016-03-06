public class torre{
  int pos_intx =0;
  int pos_inty =0;
  String name = "";
  boolean primerM;
  public torre(int pix,int piy,String n,boolean primerM){
    this.name = n;
    this.pos_inty = piy;
    this.pos_intx = pix;
    this.primerM = primerM;
  }
    public void setPos(int x,int y){
      pos_intx=x;
      pos_inty=y;
      if(primerM==true)
       primerM=false;
    }
    public int getPosX(){
      return pos_intx;
    }
    public int getPosY(){
      return pos_inty;
    }
    public String getName(){
      return name;
    }
    public boolean getprimerM(){
      return primerM;
    }

}
