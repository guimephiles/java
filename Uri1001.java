import java.util.Scanner;

class Uri1001{
    
    public static void main(String[] args){
        int a, b, resultado;
        
        Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        b = input.nextInt();
        
        resultado = a + b;
        
        System.out.println("X = " + resultado);
    }
}