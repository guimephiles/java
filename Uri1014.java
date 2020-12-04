import java.util.Scanner;

class Uri1014{
    
    public static void main(String[] args){
        int dist;
        double comb, resultado;

        Scanner input = new Scanner(System.in);
        
        dist = input.nextInt();
        comb = input.nextDouble();

        resultado = dist/comb;
        
        System.out.printf("%.3f%s%n",resultado,"km/l");
    }
}