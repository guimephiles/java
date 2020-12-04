import java.util.Scanner;

class Uri1059{    
    public static void main(String[] args){
        float n;
        int numero = 0;

        Scanner teclado = new Scanner(System.in);



        for(numero = 0; numero <=5; numero ++){
            n = teclado.nextInt();
            if(n > 0){
                n++;
            }
        }

        System.out.println(numero + " valores positivos");
    }
} 