import java.util.Scanner;

class Uri1074{    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int iteracoes = teclado.nextInt();
        int n = 0; 
        String type, pos, message = "", messageOld = "";

        for(int i = 0; i < iteracoes; i++){
            messageOld = message;
            n = teclado.nextInt();
            if(n % 2 == 0 && n != 0){
                message = "EVEN";
            }else if(n == 0){
                message = "NULL";
            }else{
                message = "ODD";
            }

            if(n > 0){
                message = message + " " + "POSITIVE";
            }else if(n < 0){
                message = message + " " + "NEGATIVE";
            }
            if(i == iteracoes - 1){
                message = messageOld + message;
            }else{
                message = messageOld + message + "\n";
            }
            
        }
        System.out.println(message);
    }
} 