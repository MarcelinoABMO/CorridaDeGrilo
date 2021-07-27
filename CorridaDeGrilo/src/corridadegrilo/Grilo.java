package corridadegrilo;

import java.util.Random;

public class Grilo extends Thread{
    
    private Random  random = new Random();
    private int posicao;
    private int indice;
	private int speed = 500;
    
    public Grilo(int index){
        this.indice = index;
    
    }
    
	@Override public void run()
	{
		//
		while(true)
		{
			Pulo();
			
			try
			{
				Thread.sleep(speed);
			} catch (InterruptedException ex){
				System.out.println(“deu merda no sleep da thread”);
			}
		}
	}
	
    void Pulo(){
        int pegaPulo = random.nextInt(10);
        posicao += pegaPulo;
        
        System.out.println("O grilo " + indice + " pulou " + pegaPulo + " e ja percorreu " + posicao + "cm");
    }
}