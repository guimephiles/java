import java.util.Scanner;

class Uri1051{    
    public static void main(String[] args){
        double renda, faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0;

        Scanner input = new Scanner(System.in);
        renda = input.nextDouble();

        if(renda >= 0 && renda <= 2000){
            System.out.println("Isento");
        }

        if(renda > 2000 && renda <= 3000){
            System.out.printf("%s%.2f%n","R$ ", (renda - 2000) * 0.08);
        }

        if(renda > 3000 && renda <= 4500){
            System.out.printf("%s%.2f%n","R$ ", (1000 * 0.08) + (renda - 3000) * 0.18);

        }

        if(renda > 4500){
            System.out.printf("%s%.2f%n","R$ ", (1000 * 0.08) + (1500 * 0.18) + (renda - 4500) * 0.28);

        }
    }
}