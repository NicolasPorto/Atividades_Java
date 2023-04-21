
package ATIVIDADE_2;

import java.util.Scanner;

public class DO_WHILE_2 {
       public static void main(String arg[]){
       Scanner imput = new Scanner(System.in);

       int num1;
       int fatorial = 1;

       System.out.print("Digite um número para fatoração:");
        
       num1 = imput.nextInt();

       do{ 
 
          fatorial = fatorial * num1; //Soma a multiplicação do fatorial;
    
                   
          System.out.println(fatorial + " x " + num1 + " = " + (fatorial * num1)); //Faz a tabuada de fatorial na tela;
          
          num1--;
          
          } while(num1 > 0);

            
       System.out.println("O resultado é: " +fatorial);   
      }
      
      

}

