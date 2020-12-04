import java.util.Scanner;

class Uri1064{    
    public static void main(String[] args){
        float n = 0, soma = 0;
        int numero = 0;

        Scanner teclado = new Scanner(System.in);



        for(int i = 0; i <=5; i++){
            n = teclado.nextFloat();
            if(n > 0){
                numero++;
                soma = soma + n;
            }
        }

        System.out.println(numero + " valores positivos");
        System.out.printf("%.1f%n",soma/numero);
    }
} 