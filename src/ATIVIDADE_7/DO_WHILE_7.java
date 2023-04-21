package ATIVIDADE_7;

import java.util.Scanner;

public class DO_WHILE_7 {
       public static void main(String arg[]){

       int num = 100;
       int soma = 0;

            do{

               if((num%2) == 0){
          
                 System.out.println(num);
                 soma = soma + num;

               }
           
            num++;
           
            }while(num <= 200);

       System.out.println("A soma dos números pares é:" +soma);

       }
}
