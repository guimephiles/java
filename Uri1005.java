import java.util.Scanner;

class Uri1005{
    
    public static void main(String[] args){
        double a, b, resultado;
        
        Scanner input = new Scanner(System.in);
        
        a = input.nextDouble();
        b = input.nextDouble();
        
        resultado = ((a*3.5) + (b*7.5)) / 11;
        
        System.out.printf("%s%.5f%n", "MEDIA = ", resultado);
        System.out.println();
    }
}