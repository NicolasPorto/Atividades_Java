package HERANCA;


public class usandoAnimal {

       public static void mostrarCaracteristicas(Animal obj){

              System.out.println("Zoo:\n"
              + "-------------------------\n"
              + "Animal: " + obj.getNome() + "\n"
              + "Comprimento: " + obj.getComprimento() + "cm\n"
              + "Patas: " + obj.getPatas() + "\n"
              + "Cor: " + obj.getCor() + "\n"
              + "Ambiente: " + obj.getAmbiente() + "\n"
              + "Velocidade: " + obj.getVelocidade() + "m/s");

      }

      public static void mostrarCaracteristicas(Peixe obj){

              System.out.println("Zoo:\n"
              + "-------------------------\n"
              + "Animal: " + obj.getNome() + "\n"
              + "Comprimento: " + obj.getComprimento() + "cm\n"
              + "Patas: " + obj.getPatas() + "\n"
              + "Cor: " + obj.getCor() + "\n"
              + "Ambiente: " + obj.getAmbiente() + "\n"
              + "Velocidade: " + obj.getVelocidade() + "\n"
              + "Barbatana: " + obj.getBarbatanas() + "\n"
              + "Caudas: " + obj.getCaudas());

      }

      public static void mostrarCaracteristicas(Mamifero obj){

              System.out.println("Zoo:\n"
              + "-------------------------\n"
              + "Animal: " + obj.getNome() + "\n"
              + "Comprimento: " + obj.getComprimento() + "cm\n"
              + "Patas: " + obj.getPatas() + "\n"
              + "Cor: " + obj.getCor() + "\n"
              + "Ambiente: " + obj.getAmbiente() + "\n"
              + "Velocidade: " + obj.getVelocidade() + "\n"
              + "Barbatana: " + obj.getAlimento());

      }   

       public static void main(String arg[]){

              Animal Camelo = new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2);

              Peixe Tubarao = new Peixe("Tubarão", "Cinzento", "Mar", 300, 0, 2, "Sim","Sim");
 
              Mamifero Urso = new Mamifero("Urso", "Vermelho", "Terra", "Mel", 180, 5, 4);

              mostrarCaracteristicas(Camelo);
              mostrarCaracteristicas(Tubarao);
              mostrarCaracteristicas(Urso);
      }
}
