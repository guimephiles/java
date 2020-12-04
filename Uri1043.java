import java.util.Scanner;

class Uri1043{    
    public static void main(String[] args){
        float a,b, c;

        Scanner input = new Scanner(System.in);
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        if(Math.abs(b-c) < a && (b+c) > a){
            System.out.println("Perimetro = " + (a + b + c));
        }else{
            System.out.println("Area = " + ((a + b) * c)/2);
        }

    }
}