public class Animal{
  private String tipo;
  private String cor;

  public Animal(String tipo, String cor){
    this.tipo = tipo;
    this.cor = cor;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  public String getTipo(){
    return this.tipo;
  }

  public void setCor(String cor){
    this.cor = cor;
  }

  public String getCor(){
    return this.cor;
  }

  @Override
  public String toString(){
    return ("Tipo : " + this.tipo + "|" + " Cor : "+ this.cor);
  }

}