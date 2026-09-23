import java.util.Scanner;
public class BEE1151 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int A = 0;
        int B = 1;
        int C = 0;
        int X = 0;
        int N= leitor.nextInt();
        N=N-2;
        System.out.print(C + " " + B);
        do {
            A = B + C;
            System.out.print(" "+A);
            C = B;
            B = A;
            X++;
        }while (N>X);
        System.out.print("\n");



    }


}
