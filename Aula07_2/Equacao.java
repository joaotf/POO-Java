import javax.swing.JOptionPane;

public class Equacao {
    private int a;
    private int b;
    private int c;
    float delta = 0;
    float equacao_1 = 0;
    float equacao_2 = 0;
    

    public Equacao(int a,int b,int c){
      this.a = a;
      this.b = b;
      this.c = c;
    }

    public void setA(int a){
      this.a = a;
    }

    public int getA(){
      return this.a;
    }

    public void setB(int b){
      this.b = b;
    }

    public int getB(){
      return this.b;
    }

    public void setC(int c){
      this.c = c;
    }

    public int getC(){
      return this.c;
    }

    public void calcularBhaskara(int a,int b,int c){
      delta = (float) ((Math.pow(b,2)) - (4*a*c));
      if( delta == 0 ){
        this.equacao_1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
        this.equacao_2 = (float) ((-b - Math.sqrt(delta)) / (2*a));          
      }
      else if( delta > 0 ){
        this.equacao_1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
        this.equacao_2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
      }
      
  }
}