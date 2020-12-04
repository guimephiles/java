import java.util.Scanner;

class Uri1020{
    
    public static void main(String[] args){

        int idade, ano = 0, mes = 0, dia = 0;

        Scanner input = new Scanner(System.in);
        
        idade = input.nextInt();


        ano = idade / 365;

        mes  = idade % 365 / 30;

        idade = idade % 365;

        dia = idade % 30;


        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

    }
}