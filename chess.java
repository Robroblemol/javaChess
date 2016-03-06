import java.util.Scanner;

public class chess {
 public static void main(String[] args) {

   boolean flag_again=true;
   int c=0,f=0;
   String decide = "";
   Scanner Input = new Scanner(System.in);
   tablero Tablero = new tablero();
   Tablero.start();
   menu Menu = new menu();

   peon [] Peones = new peon[8];
   for(int i=0;i<Peones.length;i++){
     Peones [i] = new peon (1,i,Tablero.getName(1,i),"P",true);
   }

   torre Torres []= new torre[2];
   Torres[0] = new torre (0,0,Tablero.getName(0,0),true);
   Torres[1] = new torre (0,7,Tablero.getName(0,7),true);

   Tablero.show();


while(flag_again==true){
  // Menu.mov_Ficha(Tablero,Peones);
  //Tablero.show();

  Menu.mov_Ficha(Tablero,Torres);
  Tablero.show();

    System.out.println("deseacontinuar jugando?");
    decide=Input.next();
    if(decide.equals("N")||decide.equals("n"))
    flag_again=false;
    else if(decide.equals("s")||decide.equals("S"))
    System.out.println("0K!");
    else     System.out.println("Que Coño??");
}



    //Menu.mov_Ficha(Tablero,Torres);
    // Tablero.show();
    //Menu.mov_Ficha(Tablero,Torres);
    //  Tablero.show();
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
