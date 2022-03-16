//16.Modifique a função do fatorial para exibir sua variável local e o parâmetro de
//chamada recursiva. Para cada chamada recursiva, exiba as saídas em uma
//linha separada e adicione um nível de recuo (tabulação). Faça o melhor que
//você puder para tornar a saída limpa, interessante e significativa. Seu objetivo
//aqui é projetar e implementar um formato de saída que facilite o entendimento
//da recursão.


import java.util.Scanner;

public class quest16 {
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int fat=0, resultado =0;

        System.out.printf("Calculo do Fatorial de :");
        fat = sc.nextInt();
    

        resultado = fatorial(fat);

        System.out.printf("%d \n", resultado);

        sc.close();
    }

    public static int fatorial( int n ){
        if(n == 0){
            return 1;
        }else{
            return n * fatorial( n-1);  
        }
    }
}


