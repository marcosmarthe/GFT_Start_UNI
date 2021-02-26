import java.io.IOException;
import java.util.Scanner;

 

public class Main {
    
    public static void main(String[] args) throws IOException {

 

    Scanner input = new Scanner (System.in);
    int soma = 0;
    
    while(soma<=300){
    System.out.println("Digite um Numero");
    int numero = input.nextInt();
    if(numero<0)
    System.out.println("Numeros negativos não são permitidos");
    else
    soma += numero;
        
    }
     System.out.println("O somatório foi "+soma);
        
        }
    }