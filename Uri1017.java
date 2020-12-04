import java.util.Scanner;

class Uri1017{
    
    public static void main(String[] args){
        int time,vel;
        double resultado;

        Scanner input = new Scanner(System.in);
        
        time = input.nextInt();
        vel = input.nextInt();

        resultado = ((double)vel/12) * (double)time;
        
        System.out.printf("%.3f%n",resultado);
    }
}