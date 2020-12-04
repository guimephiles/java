import java.util.Scanner;

class Uri1046{    
    public static void main(String[] args){
        int inicial;
        int durfinal;
        int duracao = 0;

        Scanner input = new Scanner(System.in);
        inicial = input.nextInt();
        durfinal = input.nextInt();


        if(durfinal > inicial){
            duracao = durfinal - inicial;
        }
        if(durfinal == inicial){
            duracao = 24;
        }
        if(durfinal < inicial){
            duracao = (24 % inicial) + durfinal;
        }

        System.out.println("O JOGO DUROU "+ duracao +" HORA(S)");
    }
}