package corridadegrilo;

import java.util.Random;

public class Grilo extends Thread{
    
    private Random  random = new Random();
    private int posicao;
    private int indice;
    
    public Grilo(int index){
        this.indice = index;
    
    }
    
	@Override public void run()
	{
		//
		while(true)
		{
			Pulo();
			
			Thread.sleep(x);
		}
	}
	
    void Pulo(){
        int pegaPulo = random.nextInt(10);
        posicao += pegaPulo;
        
        System.out.println("O grilo " + indice + " pulou " + pegaPulo + " e ja percorreu " + posicao + "cm");
    }
}