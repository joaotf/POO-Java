public class Calculadora {
    private double x,y;
    private String operacao;

    public Calculadora(double x, double y, String operacao){
      this.x = x;
      this.y = y;
      this.operacao = operacao;
    }

    public void setX(double x){
      this.x = x;
    }

    public double getX(){
      return this.x;
    }

    public void setY(double y){
      this.y = y;
    }

    public double getY(){
      return this.y;
    }

    public void setChar(String operacao){
      this.operacao = operacao;
    }

    public String getChar(){
      return this.operacao;
    }

    public double Calcular(){
        switch (operacao) {
          case "+":
            return (this.x + this.y);
          
          case "-":
            return (this.x - this.y);
            
          case "/":
            return (this.x / this.y);
            
          case "*":
            return (this.x * this.y);            
        }
        return 0;
    }
}