import java.util.Scanner;

//Escreva um programa que receba um número de 3 dígitos no formato CDU e o
//reescreva no formato UCD. Exemplo: 123 deve ser reescrito como 312

public class quest5 {
    
    public static void main(String[] args){
        Scanner str = new Scanner (System.in);

        String frase, invert;

        System.out.println("Digite um conjunto de caractere : ");
        
        frase = str.next();

        invert = new StringBuilder(frase).reverse().toString();

        System.out.println(invert);

        str.close();

    }
}
