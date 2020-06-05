import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
  
  
  public static String show(ArrayList<Cocker> animais){
    String resultado = "";
    for(int i = 0; i < animais.size(); i++){
      resultado += "\nNome : "+ animais.get(i).getNome()+"\n"+"Raça : "+animais.get(i).getRaca()
      +"\n"+"Tipo : "+animais.get(i).getTipo()+"\n"+"Cor : "+animais.get(i).getCor()+"\n"+
      "Banho : "+animais.get(i).precisaTosa()+"\n----------------";
    }
    return resultado;
  }
  public static void main(String[] args) {
    int menu = 0;
    String nome,raca,tipo,cor,resultado="";
    ArrayList<Cocker> animais = new ArrayList<Cocker>();

    do {
      menu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1) Adicionar animal\n2) Visualizar animais\n3) Dar banho no animal\n4) Sair"));
      switch (menu) {
        case 1:
            Cocker cocker = new Cocker("nome", "raca", "tipo", "cor");
            nome = JOptionPane.showInputDialog("Digite o nome");
            raca = JOptionPane.showInputDialog("Digite a raça");
            tipo = JOptionPane.showInputDialog("Digite o tipo");
            cor = JOptionPane.showInputDialog("Digite a cor");

            cocker.setNome(nome);
            cocker.setRaca(raca);
            cocker.setTipo(tipo);
            cocker.setCor(cor);

            animais.add(cocker);
            JOptionPane.showMessageDialog(null,"Animal adicionado!");

            break;
        case 2:
          JOptionPane.showMessageDialog(null,show(animais));
          break;
        case 3:
          String nome_animal = JOptionPane.showInputDialog(show(animais)+"\n\nDigite o nome do animal");
          boolean achou = false;

          for (int j = 0; j < animais.size(); j++) {
            if(animais.get(j).getNome().equals(nome_animal) == true){
              animais.get(j).setTosa(true);
              JOptionPane.showMessageDialog(null,"Animal tosado!");
              achou = true;
              break;
            }
          }
          
          if(achou == false) JOptionPane.showMessageDialog(null,"Animal não está na lista!");
          break;
        case 4:
          System.exit(0);
        default:
          JOptionPane.showMessageDialog(null,"Opção inválida!");
      }
    }while(menu != 4);
  }
}