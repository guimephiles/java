import java.util.Scanner;

class Uri1060{    
    public static void main(String[] args){
        float n;
        int numero = 0;

        Scanner teclado = new Scanner(System.in);



        for(int i = 0; i <=5; i++){
            n = teclado.nextFloat();
            if(n > 0){
                numero++;
            }
        }

        System.out.println(numero + " valores positivos");
    }
} 