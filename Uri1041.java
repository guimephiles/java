import java.util.Scanner;

class Uri1041{
    
    public static void main(String[] args){
        double x,y;
        String quadrante = null;

        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();

        if(x > 0 && y > 0){
            quadrante = "Q1";
        }
        if (x > 0 && y < 0){
            quadrante = "Q4";
        }
        if (x < 0 && y > 0){
            quadrante = "Q2";
        }
        if (x < 0 && y < 0){
            quadrante = "Q3";
        }
        if (x == 0 && y == 0){
            quadrante = "Origem";
        }
        if(x == 0 && y != 0){
            quadrante = "Eixo Y";
        }
        if(x != 0 && y == 0){
            quadrante = "Eixo X";
        }

        System.out.println(quadrante);
    }
}