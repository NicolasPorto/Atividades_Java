package HERANCA;


public class Peixe extends Animal {

   private String barbatanas;
   private String caudas;

   public Peixe(String nome, String barbatanas, String caudas, int patas, int comprimento, float velocidade, String cor, String ambiente){
        
        super(nome, comprimento, patas, cor, ambiente, velocidade);

        this.barbatanas = barbatanas;
        this.caudas = caudas;
   }     

    public String getBarbatanas() {
        return barbatanas;
    }

    public void setBarbatanas(String barbatanas) {
        this.barbatanas = barbatanas;
    }

    public String getCaudas() {
        return caudas;
    }

    public void setCaudas(String caudas) {
        this.caudas = caudas;
    }

    

      
}
