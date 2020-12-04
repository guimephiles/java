import java.util.Scanner;

class Uri1018{
    
    public static void main(String[] args){
        int valor, valorold, valor100, valor50, valor20, valor10, valor5, valor2, valor1;

        Scanner input = new Scanner(System.in);
        
        valor = input.nextInt();
        valorold = valor;

        valor100 = valor/100;
        valor = valor%100;
        valor50 = valor/50;
        valor = valor%50;
        valor20 = valor/20;
        valor = valor%20;
        valor10 = valor/10;
        valor = valor%10;
        valor5 = valor/5;
        valor = valor%5;
        valor2 = valor/2;
        valor = valor%2;
        valor1 = valor/1;

        
        System.out.println(valorold);
        System.out.println(valor100 + " nota(s) de R$ 100,00");
        System.out.println(valor50+ " nota(s) de R$ 50,00");
        System.out.println(valor20 + " nota(s) de R$ 20,00");
        System.out.println(valor10 + " nota(s) de R$ 10,00");
        System.out.println(valor5 + " nota(s) de R$ 5,00");
        System.out.println(valor2 + " nota(s) de R$ 2,00");
        System.out.println(valor1 + " nota(s) de R$ 1,00");
    }
}