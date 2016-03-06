import java.util.Scanner;

public class chess {
 public static void main(String[] args) {

   int c=0,f=0;
   String ficha = "";
   Scanner Input = new Scanner(System.in);
   tablero Tablero = new tablero();
   peon [] Peones = new peon[8];
   menu Menu = new menu();

   Tablero.start();
   Tablero.show();

   for(int i=0;i<Peones.length;i++){
     Peones [i] = new peon (1,i,Tablero.getName(1,i),"P",true);
   }
   Menu.mov_Ficha(Tablero,Peones);
   Tablero.show();

/*   System.out.println("digite pocision en x");
   f=Input.nextInt();
   System.out.println("digite pocision en y");
   c=Input.nextInt();

  if(Tablero.busy(f,c))
   System.out.println("direccion libre");
   else
   System.out.println("direccion ocupada");
*/
   /*System.out.println("digite pocision en y");
   f=Input.nextInt();
   System.out.println("digite pocision en x");
   c=Input.nextInt();
   System.out.println("nombre de ficha "+Peones[0].getName());
   //ficha=Input.next();

   //P1.mov_ficha(f,c);
   Tablero.mov_peon(f,c,Peones[0]);
   Tablero.show();
  System.out.println("pocicion "+Peones[0].getName()+" x "+Peones[0].getPosX()+" y "+Peones[0].getPosY());
  System.out.println("digite pocision en y");
  f=Input.nextInt();
  System.out.println("digite pocision en x");
  c=Input.nextInt();
   Tablero.mov_peon(f,c,Peones[0]);
  Tablero.show();*/

  }
}
