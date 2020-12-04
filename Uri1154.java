import java.util.Scanner;

class Uri1154{   
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int idade = 0; 
        double somador = 0;
        double contador = 0;

        do{
            idade = teclado.nextInt();
            if(idade >= 0){
                somador = somador + idade;
                contador++;
            }

        }while(idade > 0);
        System.out.printf("%.2f%n",somador/contador);
    }
}