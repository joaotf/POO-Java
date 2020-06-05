public class Pessoa {
  private String nome;
  private int idade;
  private double altura;
  private String sexo;

  public Pessoa(String nome, int idade, double altura, String sexo){
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.sexo = sexo;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

  public int getIdade(){
    return this.idade;
  }

  public void setAltura(double altura){
    this.altura = altura;
  }

  public double getAltura(){
    return this.altura;
  }

  public void setSexo(String sexo){
    this.sexo = sexo;
  }

  public String getSexo(){
    return this.sexo;
  }
}