import javax.swing.JOptionPane;

public class Main {
    public static void main(String args[]){
        int menu = 0;
        Equacao equacao = new Equacao(0,0,0);
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1) Informar valores\n2) Visualizar último resultado\n3) Sair ")); 
            
            switch (menu) {
                case 1:
                try {
                    equacao.setA(Integer.parseInt(JOptionPane.showInputDialog("Digite o A")));
                    equacao.setB(Integer.parseInt(JOptionPane.showInputDialog("Digite o B")));
                    equacao.setC(Integer.parseInt(JOptionPane.showInputDialog("Digite o C")));
                    equacao.calcularBhaskara(equacao.getA(),equacao.getB(),equacao.getC());
                    if(equacao.delta < 0){
                        JOptionPane.showMessageDialog(null,"Delta não possui raiz!");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null,String.format("R1 : %.1f \nR2 : %.1f",equacao.equacao_1,equacao.equacao_2));
                        break;  
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Valor inválido!");
                    break;
                } 
                case 2:
                    JOptionPane.showMessageDialog(null,String.format("R1 : %.1f \nR2 : %.1f",equacao.equacao_1,equacao.equacao_2));
                    break;
                case 3:
                    System.exit(0);
                default:
                JOptionPane.showMessageDialog(null,"Opção inválida!");
            }
        }while(menu != 3);
    }
}