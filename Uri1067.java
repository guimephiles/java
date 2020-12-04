import java.util.Scanner;

class Uri1067{    
    public static void main(String[] args){
        int n = 0;

        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();

        for(int i = 0; i <= n; i++){
            if((i % 2) != 0){
                System.out.println(i);
            }
        }
    }
} 