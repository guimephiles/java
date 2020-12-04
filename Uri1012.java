import java.util.Scanner;

class Uri1012{
    
    public static void main(String[] args){
        double a, b, c, pi = 3.14159d;

        Scanner input = new Scanner(System.in);
        
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        System.out.printf("%s%.3f%n","TRIANGULO: ", (a*c/2));
        System.out.printf("%s%.3f%n","CIRCULO: ", pi * (c*c));
        System.out.printf("%s%.3f%n","TRAPEZIO: ", ((a+b)/2)*c);
        System.out.printf("%s%.3f%n","QUADRADO: ", b*b);
        System.out.printf("%s%.3f%n","RETANGULO: ", a*b);
    }
}