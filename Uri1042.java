import java.util.Scanner;

class Uri1042{
    
    public static void main(String[] args){
        int n1,n2, n3, first = 0, second = 0, third = 0, aux;

        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if(n1 <= n2){
            first = n1;
            second = n2;
        }else{
            first = n2;
            second = n1;
        }

        if(n3 <= second){
            third = second;
            second = n3;
        }else{
            third = n3;
        }

        if(second <= first){
            aux = first;
            first = second;
            second = aux;
        }

        if(n1 == n2 && n2 == n3){
            first = n1;
            second = n2;
            third = n3;
        }




        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }
}