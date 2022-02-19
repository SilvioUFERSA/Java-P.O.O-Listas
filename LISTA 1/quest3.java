import java.util.Scanner;

// Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos. 
//Divulgue também seno, cosseno, tangente, cossecante, secante e cotangente do ângulo.

public class quest3 {

        public static void main (String[] args){
           
            Scanner entrada = new Scanner(System.in);

            int graus;
            double radio, sen, cos, tg, sec, cossec, cotg;

            System.out.println("Digite o valor em graus: ");
            
            graus = entrada.nextInt();
        
             radio = (graus * Math.PI) / 180;

            cos = Math.cos(graus);
            sen = Math.sin(graus);
            tg = Math.tan(graus);

            sec = 1 / cos;
            cossec = 1 / sen;
            cotg = 1 / tg;

             System.out.printf("- %d ° eh : %.3f radianos \n", graus, radio);
             System.out.printf("- cosseno de %d eh: %.6f \n", graus, cos );
             System.out.printf("- seno de %d eh: %.6f \n", graus, sen );
             System.out.printf("- tangente de %d eh: %.6f \n", graus, tg );
             
             System.out.printf("- secante de %d eh: %.6f \n", graus, sec );
             System.out.printf("- cossecante de %d eh: %.6f \n", graus, cossec );
             System.out.printf("- cotangente de %d eh: %.6f \n", graus, cotg );

             entrada.close();
        }

}
