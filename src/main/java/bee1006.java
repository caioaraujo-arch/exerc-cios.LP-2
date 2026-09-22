import java.util.Scanner;

public class bee1006 {
    public static void main(String[] args){
        Scanner leitor= new Scanner(System.in);
        System.out.println("NOTA A");
        double notaA= leitor.nextDouble();
        System.out.println("NOTA B");
        double notaB= leitor.nextDouble();
        System.out.println("NOTA C");
        double notaC= leitor.nextDouble();
        double media = ((notaA* 2)+(notaB*3)+(notaC*5))/10;
        System.out.printf("MEDIA = %.1f\n ", media);
    }

}
