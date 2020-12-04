import java.util.Scanner;

class Uri1019{
    
    public static void main(String[] args){

        int sIn, horas = 0, minutos = 0, segundos = 0;

        Scanner input = new Scanner(System.in);
        
        sIn = input.nextInt();


        horas = sIn / 60 / 60;
        minutos  = sIn / 60 % 60;
        segundos = sIn % 60 % 60 % 60;




        System.out.println(horas + ":" + minutos + ":" + segundos);


    }
}