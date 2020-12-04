import java.util.Scanner;

class Uri1007{
    
    public static void main(String[] args){
        int funcNum, horasTrab;
        double valorHora, resultado

        Scanner input = new Scanner(System.in);
        
        funcNum = input.nextInt();
        horasTrab = input.nextInt();
        valorHora = input.nextDouble();
        
        resultado = (float)horasTrab * valorHora;
        
        System.out.println("NUMBER = " + funcNum);
        System.out.printf("%s%.2f%n","SARALY = U$ ", resultado)
    }
}