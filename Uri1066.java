import java.util.Scanner;

class Uri1066{    
    public static void main(String[] args){
        int n = 0,  par = 0, impar = 0, pos = 0, neg = 0;

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i <= 4; i++){
            n = teclado.nextInt();
            if((n % 2) == 0){
                par++;
            }

            if((n % 2) != 0){
                impar++;
            }

            if(n > 0){
                pos++;
            }

            if(n < 0){
                neg++;
            }
        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
} 