import java.util.Scanner;
public class leitordecidade {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println ("digite seu Nome");
        String nome = leitor.nextLine();
        System.out.println ( "qual sua cidade?");
        String cidade = leitor.nextLine();
        System.out.println("qual sua idade?");
        int idade = leitor.nextInt();
        System.out.println ("Oi " +nome+"!  Que legal saber que você é de "+cidade+" e tem "+idade+" anos");
    }


}
