import java.util.Scanner;
public class bee1074 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int cont = 0;
        while(cont<N){
            int x = leitor.nextInt();
            if( x%2==0 && x>0){
                System.out.println("EVEN POSITIVE");
            }
            if( x%2==1 && x>0){
                System.out.println("ODD POSITIVE");
            }
            if( x%-2==0 && x<0){
                System.out.println("EVEN NEGATIVE");
            }
            if( x%-2!=0 && x<0){
                System.out.println("ODD NEGATIVE");
            }
            if(x==0){
                System.out.println("NULL");
            }
            cont++;
        }
    }

}
