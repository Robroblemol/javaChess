import java.util.Scanner;

public class chess {
 public static void main(String[] args) {

   int c=0,f=0;
   String ficha = "";
   Scanner Input = new Scanner(System.in);
   tablero Tablero = new tablero();
   //peon P1 = new peon(1,0,"P1");

   Tablero.start();
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
   System.out.println("digite pocision en x");
   f=Input.nextInt();
   System.out.println("digite pocision en y");
   c=Input.nextInt();
   System.out.println("nombre de ficha");
   ficha=Input.next();

   //P1.mov_ficha(f,c);
   Tablero.set_pos(f,c,ficha);
   Tablero.show();
  }
}
