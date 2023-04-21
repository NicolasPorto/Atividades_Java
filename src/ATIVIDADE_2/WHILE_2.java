
package ATIVIDADE_2;

import java.util.Scanner;

public class WHILE_2 {
       public static void main(String arg[]){
       Scanner imput = new Scanner(System.in);

       int num1;
       int fatorial = 1;

       System.out.print("Digite um número para fatoração:");
        
       num1 = imput.nextInt();

       while (num1 > 1){   

            fatorial = fatorial * num1;
         
            num1--;
        
            System.out.println(fatorial + " x " + num1 + " = " + (fatorial * num1));
      }
      
      System.out.println("O resultado é: " +fatorial);

      }

}
