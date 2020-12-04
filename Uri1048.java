import java.util.Scanner;

class Uri1048{    
    public static void main(String[] args){
        double salario, perc = 0, newSal = 0, reaj = 0;

        Scanner input = new Scanner(System.in);
        salario = input.nextDouble();

        if(salario >= 0 && salario <= 400){
            perc = 0.15;
            newSal = salario * (perc + 1);
            reaj = newSal - salario;
        }

        if(salario > 400 && salario <= 800){
            perc = 0.12;
            newSal = salario * (perc + 1);
            reaj = newSal - salario;
        }

        if(salario > 800 && salario <= 1200){
            perc = 0.10;
            newSal = salario * (perc + 1);
            reaj = newSal - salario;
        }

        if(salario > 1200 && salario <= 2000){
            perc = 0.07;
            newSal = salario * (perc + 1);
            reaj = newSal - salario;
        }

        if(salario > 2000){
            perc = 0.04;
            newSal = salario * (perc + 1);
            reaj = newSal - salario;
        }

        System.out.printf("%s%.2f%n","Novo salario: ", newSal);
        System.out.printf("%s%.2f%n","Reajuste ganho: ", reaj);
        System.out.println("Em percentual: " + (int)(perc * 100) + " %");
    }
}