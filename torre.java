public class torre{
  int pos_intx =0;
  int pos_inty =0;
  String name = "";
  public torre(int pix,int piy,String n){
    this.name = n;
    this.pos_inty = piy;
    this.pos_intx = pix;
  }
    public void setPos(int x,int y){
      pos_intx=x;
      pos_inty=y;
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

}
