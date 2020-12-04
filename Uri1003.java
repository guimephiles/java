import java.util.Scanner;

class Uri1003{
    
    public static void main(String[] args){
        double a, b, resultado;
        
        Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextInt();
        
        resultado = a + b;
        
        System.out.print("MEDIA = ");
        System.out.printf("%.5f%n", resultado);
        System.out.println();
    }
}