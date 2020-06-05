import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
      int menu = 0;
      double x=0,y=0;
      String operacao;
      do {
        menu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1) Calculadora\n2) Sair"));
        if(menu == 1){
          Calculadora calculo = new Calculadora(0,0,"");
          x = Double.parseDouble(JOptionPane.showInputDialog("Digite o X"));
          y = Double.parseDouble(JOptionPane.showInputDialog("Digite o Y"));
          operacao = JOptionPane.showInputDialog("Digite a operação");
          if( operacao.equals("/") == true ){
            if( x == 0 || y == 0){
              JOptionPane.showMessageDialog(null,"Divisões por zero não são permitidas!");
            }else{
              calculo.setX(x);
              calculo.setY(y);
              calculo.setChar(operacao);
              JOptionPane.showMessageDialog(null,calculo.Calcular());  
            }
          }else {
            calculo.setX(x);
            calculo.setY(y);
            calculo.setChar(operacao);
            JOptionPane.showMessageDialog(null,calculo.Calcular());
          }
          
        }

        if(menu == 2) System.exit(0);

      }while(menu != 2);
    }
}