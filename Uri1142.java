import java.util.Scanner;

class Uri1142{    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n = 0, contador = 0;
        n = teclado.nextInt();
        
        for(int i = 0; i < n; i++){
            contador++;
            System.out.print(contador + " ");
            contador++;
            System.out.print(contador + " ");
            contador++;
            System.out.print(contador + " ");
            System.out.println("PUM");
            contador++;
        }
    }
} 