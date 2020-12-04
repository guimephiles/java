import java.util.Scanner;

class Uri1114{    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int inputSenha = 0;

        while(inputSenha != 2002){
            inputSenha = teclado.nextInt();
            if(inputSenha != 2002){
                System.out.println("Senha Invalida");
            }
        }
        System.out.println("Acesso Permitido");
    }
} 