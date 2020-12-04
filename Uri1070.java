import java.util.Scanner;

class Uri1070{    
    public static void main(String[] args){
        int n = 0, con = 0;

        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();

        for(int i = n; con < 6; i++){
            if((i % 2) != 0){
                System.out.println(i);
                con++;
            }
        }
    }
} 