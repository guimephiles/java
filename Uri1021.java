import java.util.Scanner;

class Uri1021{
    
    public static void main(String[] args){
        double valor, valorold, valor100, valor50, valor20, valor10, valor5, valor2;
        double valorM1, valorM5, valorM10, valorM25, valorM50, valorM1M;

        Scanner input = new Scanner(System.in);
        
        valor = input.nextDouble();

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
        valorM1M = valor/1;
        valor = valor %1;
        valor = valor * 100;

        valorM50 = valor / 50;
        valor = valor % 50;
        valorM25 = valor / 25;
        valor = valor % 25;
        valorM10 = valor / 10;
        valor = valor % 10;
        valorM5 = valor / 5;
        valor = valor % 5;
        valorM1 = valor / 1;

        System.out.println("NOTAS:");
        System.out.println((int)valor100 + " nota(s) de R$ 100.00");
        System.out.println((int)valor50+ " nota(s) de R$ 50.00");
        System.out.println((int)valor20 + " nota(s) de R$ 20.00");
        System.out.println((int)valor10 + " nota(s) de R$ 10.00");
        System.out.println((int)valor5 + " nota(s) de R$ 5.00");
        System.out.println((int)valor2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)valorM1M + " moeda(s) de R$ 1.00");
        System.out.println((int)valorM50 + " moeda(s) de R$ 0.50");
        System.out.println((int)valorM25 + " moeda(s) de R$ 0.25");
        System.out.println((int)valorM10 + " moeda(s) de R$ 0.10");
        System.out.println((int)valorM5 + " moeda(s) de R$ 0.05");
        System.out.println((int)valorM1 + " moeda(s) de R$ 0.01");
    }
}