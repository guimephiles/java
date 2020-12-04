import java.util.Scanner;

class Main{    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int inputSenha = 0, al = 0, gas = 0, di = 0;

        while(inputSenha != 4){
            inputSenha = teclado.nextInt();
            switch(inputSenha){
                case 1:
                    al++;
                    break;
                case 2:
                    gas++;
                    break;
                case 3:
                    di++;
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + al);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + di);
    }
} 