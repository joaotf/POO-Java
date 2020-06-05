import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    int menu = 0;
    String descricao;
    int id=0,quantidade=0;
    double preco = 0;
    String resultado = "";
    double precofinal = 0;
    ArrayList<Faturar> produtos = new ArrayList<Faturar>();

    do {
      menu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1) Inserir produto\n2) Visualizar fatura\n3) Sair"));
      switch (menu) {
        case 1:
          try {
            Faturar fatura = new Faturar(0,"",0,0.0);

            id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do produto"));
            descricao = JOptionPane.showInputDialog("Digite a descrição do produto");
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade adquirida do produto"));
            if(quantidade < 0) fatura.setQuantidade(0); 
            preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
            if(preco < 0) fatura.setPreco(0);
            
            fatura.setId(id);
            fatura.setDescricao(descricao);
            fatura.setQuantidade(quantidade);
            fatura.setPreco(preco);

            produtos.add(fatura);
            JOptionPane.showMessageDialog(null,"Produto cadastrado na fatura!");
            break;
          } catch (NumberFormatException e) {
              JOptionPane.showMessageDialog(null,"Valor inválido!");
              break;
          }
        case 2:
            resultado = "";
            precofinal = 0;

            for(int i = 0; i < produtos.size(); i++){
              resultado += "\nID : "+produtos.get(i).getId()+"\n"+"Descrição : "+produtos.get(i).getDescricao()+"\n"+"Quantidade : "+produtos.get(i).getQuantidade()+"\n"+"Preço : "+produtos.get(i).getPreco()+"\n";
              precofinal += produtos.get(i).FaturarTotal(); 
            }
            resultado += "\n\nPreço Final da Fatura : "+ precofinal;
            JOptionPane.showMessageDialog(null,resultado);
            break;
        }
    }while(menu != 3);
  }
}