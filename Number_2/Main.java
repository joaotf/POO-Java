import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    int menu = 0;  
    String resultado = "",nome="",sobrenome="";
    double salario;

    ArrayList<Empregado> empregados = new ArrayList<Empregado>();

    do {
      menu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1) Adicionar empregado\n2) Visualizar empregados\n3) Aumento de Salário\n4) Sair"));
      switch (menu) {
        case 1:
          
              Empregado empregado = new Empregado("nome", "sobrenome", 0);
              nome = JOptionPane.showInputDialog("Digite o primeiro nome");
              sobrenome = JOptionPane.showInputDialog("Digite o sobrenome");
              salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do empregado"));
              
              empregado.setNome(nome);
              empregado.setSobrenome(sobrenome);
              empregado.setSalario(salario);
              
              empregados.add(empregado);
              JOptionPane.showMessageDialog(null,"Empregado adicionado!");
              break;
          
        case 2:
        resultado = "";
          for(int i=0; i < empregados.size(); i++){
            resultado += "\nNome : "+empregados.get(i).getNome()+" "+empregados.get(i).getSobrenome()+"\n"+"Salário : "+empregados.get(i).getSalario()+"\n";
          }
          JOptionPane.showMessageDialog(null,resultado);
          break;
        case 3:
          for(int y = 0; y < empregados.size(); y++){
            empregados.get(y).setSalario((empregados.get(y).getSalario() + (empregados.get(y).getSalario() * 0.10)));
          }
          JOptionPane.showMessageDialog(null,"Salário ajustado!");
          break;
        case 4:
          System.exit(0);
        default:
          JOptionPane.showMessageDialog(null,"Valor inválido!");
      }
      } while(menu != 4); 
    

  }
}