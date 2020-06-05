public class Faturar {
    private int id;
    private String descricao;
    private int quantidade;
    private double preco;

    public Faturar(int id,String descricao,int quantidade, double preco){
      this.id = id;
      this.descricao = descricao;
      this.quantidade = quantidade;
      this.preco = preco;
    }

    public void setId(int id){
      this.id = id;
    }

    public int getId(){
      return this.id;
    }

    public void setDescricao(String descricao){
      this.descricao = descricao;
    }

    public String getDescricao(){
      return this.descricao;
    }

    public void setQuantidade(int quantidade){
      this.quantidade = quantidade;
    }

    public int getQuantidade(){
      return this.quantidade;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
      return this.preco;
    }

    public double FaturarTotal(){
      return (this.quantidade * this.preco);
    }

}