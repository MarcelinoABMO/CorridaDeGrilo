package corridadegrilo;

import java.util.Random;

public class Grilo{
    
    private Random  random = new Random();
    private int posicao;
    
    void Pulo(){
        posicao += random.nextInt(10);
        
    }
}