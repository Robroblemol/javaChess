import java.util.Scanner;

public class chess {
 public static void main(String[] args) {

   int c=0,f=0;
   String ficha = "";
   Scanner Input = new Scanner(System.in);
   tablero Tablero = new tablero();

   Tablero.start();
   Tablero.show();
   System.out.println("digite pocision en x");
   f=Input.nextInt();
   System.out.println("digite pocision en y");
   c=Input.nextInt();

  if(Tablero.busy(f,c))
   System.out.println("direccion libre");
   else
   System.out.println("direccion ocupada");

   System.out.println("digite pocision en x");
   f=Input.nextInt();
   System.out.println("digite pocision en y");
   c=Input.nextInt();
   System.out.println("nombre de ficha");
   ficha=Input.next();

   Tablero.set_pos(f,c,ficha);
   Tablero.show();
  }
}
