package ATIVIDADE_3;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ATIVIDADE_TRES {
             public static void main(String arg[]){

             String nome;
             int vendas;
             int cont = 0;
             int cont_vendas;
             float total_comissao = 0;
             float total_vendas = 0;

             nome = JOptionPane.showInputDialog("Digite o seu nome:");

             String stC = JOptionPane.showInputDialog(null, "Quantas vendas deseja inserir?");
             
             cont_vendas = Integer.parseInt(stC);

             while(cont++ < cont_vendas){

                   String stV = JOptionPane.showInputDialog(null, "Digite o valor da " + cont + "° venda:");
                   
                   vendas = Integer.parseInt(stV);
                   
                   total_vendas = total_vendas + vendas;                  

             }
             
             total_comissao = (25 * total_vendas / 100) + total_vendas;
             
             JOptionPane.showMessageDialog(null, "Muito bem " +nome+ "! Esse é o seu resultado: \nTotal de vendas s/comissão: R$" + total_vendas + "\nTotal de vendas c/comissão: R$" + total_comissao);
                       
 }  
}