import java.util.Scanner;
public class bee1001VARIAÇAO {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String AB= leitor.nextLine();
        String[] partes= AB.split(",");
        int A = Integer.parseInt(partes[0].trim());
        int B = Integer.parseInt(partes[1].trim());
        int X = A+B;
        System.out.println("X = "+X);
    }


}
