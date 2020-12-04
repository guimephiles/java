import java.util.Scanner;

class Uri1144{   
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n = 0, cont = 1;
        n = teclado.nextInt();
        
        while(cont <= n){
            System.out.print(cont + " ");
            System.out.print(cont * cont + " ");
            System.out.print(cont * cont * cont);
            System.out.println();
            System.out.print(cont + " ");
            System.out.print(((cont * cont) + 1) + " ");
            System.out.print((cont * cont * cont) + 1);
            System.out.println();
            cont++;
        }
    }
}