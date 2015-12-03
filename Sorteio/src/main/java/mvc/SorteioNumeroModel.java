
package mvc;

import java.util.Random;

public class SorteioNumeroModel {
    
  private int numero1;
  private int numero2;
  private String sorteio;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public String getSorteio() {
        return sorteio;
    }

    public void setSorteio(String sorteio) {
        this.sorteio = sorteio;
    }

  
   public void sortear() { 
    Random sorteio = new Random(); //imprime 1 números inteiros aleatórios entre 0 e 10. 
    for (int i = 0; i < 1; i++) { 
        System.out.println(sorteio.nextInt(10)); 
    }

  }
}

