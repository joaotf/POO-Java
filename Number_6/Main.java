import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

  public static String show_pessoas(ArrayList<Pessoa> pessoas){
    String resultado = "";

    for (int i = 0; i < pessoas.size(); i++) {
      resultado += "Nome : "+pessoas.get(i).getNome()+"\n"+"Idade : "+pessoas.get(i).getIdade()+"\n"+"Altura : "+pessoas.get(i).getAltura()+"\n"
      +"Sexo : "+pessoas.get(i).getSexo()+"\n-----------------";
    }
    return resultado;
  }
  
  public static String show_empregados(ArrayList<Empregado> empregados){
    String resultado = "";

    for (int i = 0; i < empregados.size(); i++) {
      resultado += "Nome : "+empregados.get(i).getNome()+"\n"+"Idade : "+empregados.get(i).getIdade()+"\n"+"Altura : "+empregados.get(i).getAltura()+"\n"
      +"Sexo : "+empregados.get(i).getSexo()+"\n"+"Salário : "+empregados.get(i).getSalario()+"\n-----------------";
    }
    return resultado;
  }

 public static void main(String[] args) {
   int menu = 0;
   String nome;
   int idade=0;
   double altura=0,salario=0;
   String sexo;

   ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
   ArrayList<Empregado> empregados = new ArrayList<Empregado>();

   do {
    menu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1) Adicionar Pessoa\n2) Adicionar Empregado\n3) Visualizar Pessoas\n4) Visualizar Empregados\n5) Sair"));
    switch (menu) {
      case 1:
        Pessoa pessoa = new Pessoa("nome",0,0,"sexo");
        nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa"));
        sexo = JOptionPane.showInputDialog("Digite o sexo da pessoa");

        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setAltura(altura);
        pessoa.setSexo(sexo);

        pessoas.add(pessoa);
        JOptionPane.showMessageDialog(null,"Pessoa adicionada!");
        break;
      case 2:
        Empregado empregado = new Empregado("nome",0,0,"sexo",0);
        nome = JOptionPane.showInputDialog("Digite o nome do empregado");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do empregado"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do empregado"));
        sexo = JOptionPane.showInputDialog("Digite o sexo do empregado");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do empregado"));
      
        empregado.setNome(nome);
        empregado.setIdade(idade);
        empregado.setAltura(altura);
        empregado.setSexo(sexo);
        empregado.setSalario(salario);
        
        empregados.add(empregado);

        JOptionPane.showMessageDialog(null,"Empregado adicionado!");
        break;
      
      case 3:
        JOptionPane.showMessageDialog(null,show_pessoas(pessoas));
        break;
      case 4:
        JOptionPane.showMessageDialog(null,show_empregados(empregados));
        break;
      case 5:
        System.exit(0);
      default:
        JOptionPane.showMessageDialog(null,"Opção inválida!");
    }
   }while(menu != 5);
 } 
}