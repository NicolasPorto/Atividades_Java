 
package ATIVIDADE_2;

import java.util.Scanner;

public class FOR_2 {
       public static void main(String arg[]){
       Scanner imput = new Scanner(System.in);

       int num1;
       int fatorial = 1;

       System.out.print("Digite um número para fatoração:");
   
       for(num1 = imput.nextInt(); num1 > 0; num1--){

         fatorial = fatorial * num1;
         System.out.println(fatorial + " x " + num1 + " = " + (fatorial * num1));

      }
      
      System.out.println("O resultado é: " +fatorial);

      }

}
