import java.util.Scanner;

class Uri1065{    
    public static void main(String[] args){
        int n = 0,  numero = 0;

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i <= 4; i++){
            n = teclado.nextInt();
            if((n % 2) == 0){
                numero++;
            }
        }

        System.out.println(numero + " valores pares");
    }
} 