// 11. Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo.
// Assuma que n>0.


import java.util.Scanner;

public class quest11 {
 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int prox = 1, ant = 0;
            int i, n;

            System.out.println("Digite um numero inteiro para o N-esimo termo de Fibonacci: ");
            n = sc.nextInt();

            for(i = 0; i < n; i++){
                prox = prox + ant;
                ant =  prox - ant;
                System.out.printf("%d  ",prox);
            }

            sc.close();
        }
    
}
