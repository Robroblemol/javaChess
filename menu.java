import java.util.Scanner;
public class menu {
     Scanner Input = new Scanner(System.in);


  public void mov_Ficha(tablero Tablero,peon [] Peones){
    int numPeon;
    String mov;
    boolean flag = false;
    while (flag == false){
      System.out.println("Digite del 1 al 8 para selecionar el peon a mover");
      numPeon=Input.nextInt()-1;
      System.out.println("seleciono "+Peones[numPeon].getName());
      if(Peones[numPeon].primerM){
        System.out.println("presione SS para mover dos casilla o S para solo una");
        mov = Input.next();
      }
      else{
        System.out.println("presione S para mover una casilla");
        mov = Input.next();
      }
     switch (mov.toLowerCase()) {
        case "s":
          Tablero.mov_peon(Peones[numPeon].getPosX()+1,Peones[numPeon].getPosY(),Peones[numPeon]);
          flag = true;
            break;
        case "ss":
          Tablero.mov_peon(Peones[numPeon].getPosX()+2,Peones[numPeon].getPosY(),Peones[numPeon]);
          flag = true;
            break;
        default:
          System.out.println("Valor digitado incorrecto intente de nuevo");
          break;
      }
    }
  }
    public void mov_Ficha(tablero Tablero,torre [] Torres){
      String mov;
      boolean flag = false;
      int num;
      int mag;
      char dir;
      while (flag == false){
        System.out.println("Digite (1) para mover Torre uno o (2) para Torre dos");
        num=Input.nextInt()-1;
        if(num>=0&&num<=1){
            System.out.println("seleciono "+Torres[num].getName());
            System.out.print(" digita la direccion con las teclas: \n"+
                             "                    (W) \n"+
                             "                 (A)(S)(D) \n"+
                             "      junto con la cantidad de casilla a mover\n"+
                                "ej: w3 --> Movimento hacia arriba tres casilla\n"
                              );
            mov = Input.next();
            mag = Integer.parseInt(""+mov.charAt(1));
            //if(Torres[num].getprimerM()==true)
            //    mag = mag -1;
            System.out.println("mag = "+mag+"\n N +pos x: "+(Torres[num].getPosX()+mag)+"\n N -pos x: "+(Torres[num].getPosX()-mag)+"\n N +pos y: "+(Torres[num].getPosY()+mag)+"\n N -pos y: "+(Torres[num].getPosY()-mag));//para pruebas
            if(((Torres[num].getPosX()+mag) <= 7) &&  ((Torres[num].getPosY()+mag) <= 7)){
            //System.out.println("mag = "+mag);//para pruebas
            //if(mag >= 0 && mag <= 7){
              dir = mov.charAt(0);
              switch (dir){
                case 'w':
                    if(Tablero.busy((Torres[num].getPosX()-mag),Torres[num].getPosY())){ // la posicion esta ocupada?
                    Tablero.mov_torre((Torres[num].getPosX()-mag),Torres[num].getPosY(),Torres[num]);
                    flag = true;
                    }
                    else
                    System.out.println("ya hay una ficha alli por vuelva a intentar");
                      break;
                case 's':
                    if(Tablero.busy((Torres[num].getPosX()+mag),Torres[num].getPosY())){// la posicion esta ocupada?
                    Tablero.mov_torre((Torres[num].getPosX()+mag),Torres[num].getPosY(),Torres[num]);
                    flag = true;
                    }
                    else
                    System.out.println("ya hay una ficha alli por favor vuelva a intentar");
                      break;
                case 'a':
                          if(Tablero.busy(Torres[num].getPosX(),(Torres[num].getPosY()-mag))){ // la posicion esta ocupada?
                          Tablero.mov_torre(Torres[num].getPosX(),Torres[num].getPosY()-mag,Torres[num]);
                          flag = true;
                          }
                          else
                          System.out.println("ya hay una ficha alli por favor vuelva a intentar");
                            break;
                case 'd':
                      if(Tablero.busy((Torres[num].getPosX()),(Torres[num].getPosY()+mag))){// la posicion esta ocupada?
                      Tablero.mov_torre(Torres[num].getPosX(),Torres[num].getPosY()+mag,Torres[num]);
                      flag = true;
                      }
                      else
                      System.out.println("ya hay una ficha alli por favor vuelva a intentar");
                        break;
                default:
                      System.out.println("que coños digitaste!!");
              }
            }
           }
           else{
             System.out.println("Digite cantidad de casillas entre 1 y 8");
           }
        }
      }
}
