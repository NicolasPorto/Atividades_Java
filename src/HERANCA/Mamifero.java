package HERANCA;

public class Mamifero extends Animal {

   private String alimento;

   public Mamifero(String nome, String ambiente, String alimento, String cor, int comprimento, float velocidade, int patas ){
        
        super(nome, patas, comprimento, ambiente, cor, velocidade);
        this.alimento = alimento;

     
   }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

   
}
