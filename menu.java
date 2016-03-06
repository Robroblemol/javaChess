import java.util.Scanner;
public class menu {
     Scanner Input = new Scanner(System.in);
  public void mov_Ficha(tablero Tablero,peon [] Peones){
    int numPeon;
    String mov;
    boolean flag = false;
    while (flag == false){
      System.out.println("Digite del 1 al 8 para selecionar el peon a mover");
      numPeon=Input.nextInt();
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
}
