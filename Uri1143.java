import java.util.Scanner;

class Uri1143{    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n = 0;
        n = teclado.nextInt();
        
        for(int i = 1; i <= n*2; i++){
            System.out.print(i + " ");
            System.out.print(i * i + " ");
            System.out.print(i * i * i);
            System.out.println();
        }
    }
} 