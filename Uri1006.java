import java.util.Scanner;

class Uri1006{
    
    public static void main(String[] args){
        double a, b, c, resultado;
        
        Scanner input = new Scanner(System.in);
        
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        resultado = ((a*2) + (b*3) + (c*5)) / 10;
        
        System.out.printf("%s%.1f%n", "MEDIA = ", resultado);
    }
}