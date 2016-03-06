public class peon{
boolean primerM;
int pos_intx =0;
int pos_inty =0;
String name = "";
String type = "";
  public peon(int pix,int piy,String n,String type,boolean primerM){
  this.name = n;
  this.pos_inty = piy;
  this.pos_intx = pix;
  this.type = type;
  this.primerM = primerM;
  /*System.out.println("Pocision inicial en x "+pos_intx);
  System.out.println("Pocision inicial en y "+pos_inty);
  System.out.println("nombre "+name);
  System.out.println("type "+type);*/
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
  public String getType(){
    return type;
  }
  public boolean getprimerM(){
    return primerM;
  }

}
