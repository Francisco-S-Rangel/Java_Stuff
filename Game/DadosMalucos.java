package Game;
import java.util.Random;

public class DadosMalucos{
    int maluco(){
        int aleatorio =0;
        
        Random gerar = new Random();
        aleatorio = gerar.nextInt(11)+2;
        return aleatorio;
   }
}