//Escreva um programa para imprimir uma versão aproximada de um cartão da
//Mega-Sena (somente com os números, respeitando o número de linhas e a
//distribuição dos números nas linhas).
public class quest10 {
    
    public static void main(String[] args) {
        int l, c, num = 1;
        
        for(l = 1 ; l <= 6; l++ ){
            for( c = 1; c <= 10 ; c++ ){
                if(num <10){
                    System.out.printf("[0%d]  ", num);
                    num++;
                }else{
                    System.out.printf("[%d]  ", num);
                        num++;
                }
            }
            System.out.println("\n");
        
        }

    }

}