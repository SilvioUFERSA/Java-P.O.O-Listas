//12.Escreva um programa que escreve os 4 primeiros números perfeitos. Um
//número perfeito é aquele que é igual à soma dos seus divisores (exceto o
//próprio número). Exemplos: 6=1+2+3, 28=1+2+4+7+14.


public class quest12 {

    public static void main(String[] args) {        
    
    System.out.println("os 4 primeiros numero perfeitos");
 
    int soma, i , j;
 
    for (i=1; i<=8128; i++) {       // em i pego o numero e vejo se ele é perfeito
 
        soma = 0;
 
        for (j=1; j<=(i/2); j++) {  // j são os divisores do numero (i). (i/2) j começa de 1 e vai até (i/2) que deve ser pelo menos divisivel PELO MENOS POR i 
            if ((i % j) == 0) {     // verifico se é divisivel
                soma += j;          // aqui somo todos os J caso sejam de resto 0.
            }
        }
 
            if (i == soma){         // aqui eu verifico se a soma dos divisores são meu numero candidato a ser perfeito.
                System.out.printf("%d\n", i); // entaõ eu printo meu numero perfeito.
            }
    }
    
  }

}
