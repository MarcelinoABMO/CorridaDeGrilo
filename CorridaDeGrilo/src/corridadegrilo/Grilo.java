package corridadegrilo;

import java.util.Random;

public class Grilo extends Thread{
    
    private Random random = new Random();
    private int posicao;
    public int getPosicao() { return this.posicao; }
    private int indice;
    private int speed = 500;
    private int distanciaMax;
    private int pulos;
    public int getPulos() { return this.pulos; }

    
    public Grilo(int index, int distanciaMax){
        this.indice = index;
	this.distanciaMax = distanciaMax;
    
    }
    
    @Override public void run()
    {
        //
        while(posicao < distanciaMax)
        {
            Pulo();

            try
            {
                    Thread.sleep(speed);
            } catch (InterruptedException ex){
                    System.out.println("deu merda no sleep da thread");
            }
        }
    }
	
    void Pulo(){
        int pegaPulo = random.nextInt(10);
        posicao += pegaPulo;
	pulos++;
        
        System.out.println("O Grilo_" + indice + " pulou " + pegaPulo + "cm e ja percorreu " + posicao + "cm");
    }
}