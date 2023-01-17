//Donar una de les tres opcions o que digue no si es passa del numero
import java.util.Scanner;
public class activitat2gen {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int funcio = 0;
        do{
            System.out.println("quina funcio estas fen");
            funcio = sc.nextInt();
        
      
      switch (funcio) {
        case 1:
          System.out.println("correr");
          break;
        case 2:
          System.out.println("parar");
          break;
        case 3:
          System.out.println("acabar");
          break;
          default:
          System.out.println("no");
          break;
      }  
    }
    while(funcio!=3);
  }
}