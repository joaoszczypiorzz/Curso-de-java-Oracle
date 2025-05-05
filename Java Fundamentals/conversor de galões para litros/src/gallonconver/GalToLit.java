
package gallonconver; //está no pacote gallconver

import java.util.Scanner; //adicionando scanner para ler as variaveis que o usuario inserir

public class GalToLit { //dentro do projeto GalToLit

    
    public static void main(String[] args) { //rodando como main
       double gallons=1; //declarando as variaveis 
       Scanner read = new Scanner(System.in); //declarando scanner
       
       System.out.println("----------------------------");
       System.out.println("CONVERSOR DE GALÕES PARA LITROS");
       System.out.println("Informe a quantidade de galões que deseja converter: ");
         gallons = read.nextDouble();   //recebendo variavel do usuario, declarando ela como nextdouble o usuario podera digitar um numero decimal
         double   gallonsconv = gallons*3.785; //inciando a conta
       
       System.out.println(gallons + " é igual a " + gallonsconv + " Litros "); 
      
        
    }
    
}
