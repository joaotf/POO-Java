public class Empregado extends Pessoa {
    private double salario;

    public Empregado(String nome,int idade,double altura,String sexo,double salario){
      super(nome, idade, altura, sexo);
      this.salario = salario;
    }
    
    public void setSalario(double salario){
      this.salario = salario;
    }

    public double getSalario(){
      return this.salario;
    }
}