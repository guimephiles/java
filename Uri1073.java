import java.util.Scanner;

class Uri1073{    
    public static void main(String[] args){
        int n = 0;

        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();

        for(int i = 1; i <= n; i++){
            if((i % 2) == 0){
                System.out.println(i + "^2 = " + i * i);
            }
        }
    }
} 