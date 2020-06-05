import javax.swing.JOptionPane;

public class DataTeste {
  public static void main(String args[]){
      int dia = 0,mes = 0,ano = 0, menu = 3;
      Data data = new Data(0,0,0);

      do {
        menu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1) Informar data\n2) Visualizar última data\n3) Sair"));
        switch (menu) {
          case 1:
              dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o DIA"));
              mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o MÊS"));
              ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ANO"));    
              data.setDia(dia);        
              data.setMes(mes);
              data.setAno(ano);
              JOptionPane.showMessageDialog(null,data.displayData(data.getDia(),data.getMes(),data.getAno()));
            break;
          case 2:
            JOptionPane.showMessageDialog(null,String.format("%d/%d/%d",data.getDia(),data.getMes(),data.getAno()));
            break;
          case 3:
            System.exit(0);
          default:
            JOptionPane.showMessageDialog(null,"Valor inválido!");
        }
      }while(menu != 3);
  }
}