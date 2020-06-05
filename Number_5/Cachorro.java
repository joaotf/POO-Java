public class Cachorro extends Animal {
    private String nome;
    private String raca;

    public Cachorro(String nome , String raca, String tipo, String cor){
      super(tipo, cor);
      this.nome = nome;
      this.raca = raca;
    }

    public void setNome(String nome){
      this.nome = nome;
    }

    public String getNome(){
      return this.nome;
    }

    public void setRaca(String raca){
      this.raca = raca;
    }

    public String getRaca(){
      return this.raca;
    }

  @Override
  public String toString(){
    return ("Nome : " + this.nome + "|" + " Raça : "+ this.raca);
  }

}