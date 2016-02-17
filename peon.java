public class peon{
int pos_intx =0;
int pos_inty =0;
String name = "";


  public peon(int pix,int piy,String n){
  String name = n;
  int pos_inty = piy;
  int pos_intx = pix;
  }

  public void set_posPeon(int x,int y){
    pos_intx=x;
    pos_inty=y;
  }
  public void mov_ficha(int x,int y){
    if(x <= 7 && y <= 7){
    Tablero.set_pos(pos_intx,pos_inty,"00");
    Tablero.set_pos(x,y,name);
    set_posPeon(x,y);
    }
    else
    System.out.println("ingrese valor valido");
  }

}
