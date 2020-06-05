public class Cocker extends Cachorro{
    private boolean tosa;

  public Cocker(String nome, String raca, String tipo, String cor){
    super(nome, raca, tipo, cor);
    this.tosa = tosa;
  }

  public void setTosa(boolean tosa){
    this.tosa = tosa;
  }

  public boolean precisaTosa(){
    return this.tosa;
  }
  
}