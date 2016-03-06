public class tablero {
  String [][] matrizTablero = new String [8][8];
  String [] realeza = {"T1","C1","A1","RI","RA","A2","C2","T2"};
  String [] peon    = {"P1","P2","P3","P4","P5","P6","P7","P8"};

  public String [][] start (){
    System.out.println ("Inicilizando...");
    for(int i = 0;i<matrizTablero.length;i++){
      matrizTablero[0][i]=realeza[i];
      matrizTablero[1][i]=peon [i];
    }
    for(int f = 2;f<matrizTablero.length;f++){
        for(int c = 0;c<matrizTablero.length;c++){
          matrizTablero[f][c]="00";
        }
    }
    return matrizTablero;
  }
  public void show (){
    String data = " ";
      for(int f = 0;f<matrizTablero.length;f++){
          for(int c = 0;c<matrizTablero.length;c++){
            data=matrizTablero[f][c];
            System.out.print(" "+data+" ");
          }
          System.out.println("");
      }
  }
  public boolean busy (int f, int c){
    if(matrizTablero[f][c].equals("00"))
    return true;
    else
    return false;
  }
  public void mov_peon (int x, int y,peon Peon){
    if((x-Peon.getPosX())==1||Peon.getprimerM()==true){
      matrizTablero[Peon.getPosX()][Peon.getPosY()]="00";//borro la ficha de la pocicion actual
      matrizTablero[x][y] = Peon.getName();//ajusto el nueva pocision
      Peon.setPos(x,y);//metemos la nueva pocision en la ficha
    }
    else System.out.println("Movimiento ilegal");
  }
  public String getName(int x,int y){
    return matrizTablero[x][y];
  }
}
