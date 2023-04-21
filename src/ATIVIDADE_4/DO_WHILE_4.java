package ATIVIDADE_4;

import java.util.Scanner;

public class DO_WHILE_4 {
       public static void main(String arg[]){
      
       int num = 0;
       int cont = 1;
       int soma = 0;
 
       do{

        soma = soma + num;
        num++;   

        }while(cont++ <= 100);

        System.out.println(+soma);

      }    
}
