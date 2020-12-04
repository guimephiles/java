import java.util.Scanner;

class Uri1009{
    
    public static void main(String[] args){
        String nomeFunc;
        double salario, vendasMes, resultado;

        Scanner input = new Scanner(System.in);
        
        nomeFunc = input.nextLine();
        salario = input.nextDouble();
        vendasMes = input.nextDouble();
        
        resultado = salario + (vendasMes * 0.15);
        
        System.out.printf("%s%.2f%n","TOTAL = R$ ", resultado);
    }
}