import java.util.Scanner;

class Uri1035{
    
    public static void main(String[] args){
        int a,b,c,d;

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        if (b > c){
            if (d > a){
                if((c+d) > (a+b)){
                    if((c>0) && (d>0)){
                        if((a % 2) == 0){
                            System.out.println("Valores aceitos");
                        }else{
                            System.out.println("Valores nao aceitos");
                        }
                    }else{
                        System.out.println("Valores nao aceitos");
                    }
                }else{
                    System.out.println("Valores nao aceitos");
                }
            }else{
                System.out.println("Valores nao aceitos");
            }
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}