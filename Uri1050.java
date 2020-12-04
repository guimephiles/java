import java.util.Scanner;

class Uri1050{    
    public static void main(String[] args){
        int ddd;
        String cidade;

        Scanner input = new Scanner(System.in);
        ddd = input.nextInt();

        if(ddd == 61){
            cidade = "Brasilia";
        }else if(ddd == 71){
            cidade = "Salvador";
        }else if(ddd == 11){
            cidade = "Sao Paulo";
        }else if(ddd == 21){
            cidade = "Rio de Janeiro";
        }else if(ddd == 32){
            cidade = "Juiz de Fora";
        }else if(ddd == 19){
            cidade = "Campinas";
        }else if(ddd == 27){
            cidade = "Vitoria";
        }else if(ddd == 31){
            cidade = "Belo Horizonte";
        }else{
            cidade = "DDD nao cadastrado";
        }
        
        System.out.println(cidade);
    }
}