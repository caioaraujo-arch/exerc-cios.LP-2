import javax.swing.JOptionPane;
public class atividadeIMC {
    public static void main(String[] args) {
        String pesoTexto = JOptionPane.showInputDialog("Digite seu peso");
        double peso = Double.parseDouble(pesoTexto);
        String alturaTexto = JOptionPane.showInputDialog("digite sua altura");
        double alturaCM = Double.parseDouble(alturaTexto);
        double altura= alturaCM/100;
        double imc =  peso/(altura * altura);
        System.out.println(imc);
    }

}