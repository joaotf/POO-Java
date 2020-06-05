import javax.swing.JOptionPane;

public class Main {
  public static void main(String args[]){
      Triangulo triangulo = new Triangulo(0,0);
      int base = 0,altura = 0;
      float resultado = 0;

      try {
          base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triângulo"));
          altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triângulo"));
          triangulo.setBase(base);
          triangulo.setAltura(altura);
          resultado = triangulo.calcularAreaTriangulo(triangulo.getBase(), triangulo.getAltura());
          JOptionPane.showMessageDialog(null,String.format("Resultado : %.2f",resultado));
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Valor inválido!");
      }
  }
}