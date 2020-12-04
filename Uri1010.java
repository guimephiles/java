import java.util.Scanner;

class Uri1010{
    
    public static void main(String[] args){
        int codigo1, pecas1, codigo2, pecas2;
        double valor1, valor2, resultado;

        Scanner input = new Scanner(System.in);
        
        codigo1 = input.nextInt();
        pecas1 = input.nextInt();
        valor1 = input.nextDouble();
        codigo2 = input.nextInt();
        pecas2 = input.nextInt();
        valor2 = input.nextDouble();

        resultado = (float)pecas1 * valor1 + (float)pecas2*valor2;
        
        System.out.printf("%s%.2f%n","VALOR A PAGAR: R$ ", resultado);
    }
}