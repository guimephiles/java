import java.util.Scanner;

class Uri1115{
    
    public static void main(String[] args){
        int x,y;
        String quadrante = null;

        Scanner input = new Scanner(System.in);

        while(quadrante != ""){
            x = input.nextInt();
            y = input.nextInt();

            if(x > 0 && y > 0){
                quadrante = "primeiro";
            }
            if (x > 0 && y < 0){
                quadrante = "quarto";
            }
            if (x < 0 && y > 0){
                quadrante = "segundo";
            }
            if (x < 0 && y < 0){
                quadrante = "terceiro";
            }
            if (x == 0 && y == 0){
                quadrante = "";
            }
            if(x == 0 && y != 0){
                quadrante = "";
            }
            if(x != 0 && y == 0){
                quadrante = "";
            }
            if(quadrante != ""){
                System.out.println(quadrante);
            }
        }
    }
}