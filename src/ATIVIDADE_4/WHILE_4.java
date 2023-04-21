
package ATIVIDADE_4;

import java.util.Scanner;

public class WHILE_4 {
       public static void main(String arg[]){

        int cont = 0;
        int num = 0;
        int soma = 0;

        while(cont <= 100){

             soma = soma + num;
             cont++;
             num++; 
        }

        System.out.println(+soma);

       }               
}
