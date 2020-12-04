import java.util.Scanner;

class Uri1038{
    
    public static void main(String[] args){
        int cod,qtd;
        double pag = 0;

        Scanner input = new Scanner(System.in);
        cod = input.nextInt();
        qtd = input.nextInt();

        if(cod == 1){
            pag = qtd * 4;
        }else if(cod == 2){
            pag = qtd * 4.50;
        }else if(cod == 3){
            pag = qtd * 5;
        }else if(cod == 4){
            pag = qtd * 2;
        }else if(cod == 5){
            pag = qtd * 1.50;
        }

        System.out.printf("%s%.2f%n","Total: R$ ", pag);
    }
}