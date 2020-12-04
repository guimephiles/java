import java.util.Scanner;

class Uri1036{
    
    public static void main(String[] args){
        double a,b,c, delta, x1, x2;

        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        delta = (b * b) - (4 * a * c); 
        x1 = (b * -1 + Math.sqrt(delta))/(2*a);
        x2 = (b * -1 - Math.sqrt(delta))/(2*a);

        if(delta >= 0 && a > 0){
            System.out.printf("%s%.5f%n","R1 = ", x1);
            System.out.printf("%s%.5f%n","R2 = ", x2);
        }else{
            System.out.println("Impossivel calcular");
        }
    }
}