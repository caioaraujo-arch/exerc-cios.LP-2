import java.util.Scanner;
public class bee1134 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int x = 0;
        int al=0;
        int gas=0;
        int di=0;
        while (x<1){
         int n  = leitor.nextInt();
         if(n==1){
             al++;
         }
         if(n==2){
             gas++;
         }
         if(n==3){
             di++;
         }
         if(n==4){
              x++;
         }

        }
        System.out.println("MUITO OBRIGADO\n" + "Alcool: "+al+"\n" + "Gasolina: "+gas+"\n" + "Diesel: "+di);

    }
}
