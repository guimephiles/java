import java.util.Scanner;

class Uri1047{    
    public static void main(String[] args){
        int horaInicial, minutoInicial, horaFinal, minutoFinal;
        int duracaoInicial = 0, duracaoFinal = 0, mins = 0;

        Scanner input = new Scanner(System.in);
        horaInicial = input.nextInt();
        minutoInicial = input.nextInt();
        horaFinal = input.nextInt();
        minutoFinal = input.nextInt();

        duracaoInicial = horaInicial * 60 + minutoInicial;
        duracaoFinal = horaFinal * 60 + minutoFinal;

        mins = duracaoFinal - duracaoInicial;

        if(mins <= 0){
            mins = mins + 24*60;
        }     



        System.out.println("O JOGO DUROU "+ mins/60 +" HORA(S) E " + mins%60 + " MINUTO(S)");
    }
}