import java.util.Scanner;

class Uri1011{
    
    public static void main(String[] args){
        double raio, pi = 3.14159d, resultado;

        Scanner input = new Scanner(System.in);
        
        raio = input.nextDouble();

        resultado = (4/3.0) * pi * (raio*raio*raio);
        
        System.out.printf("%s%.3f%n","VOLUME = ", resultado);
    }
}