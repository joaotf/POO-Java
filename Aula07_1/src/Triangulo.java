public class Triangulo {
    private int base;
    private int altura;

    public Triangulo(int base,int altura){
      this.base = base;
      this.altura = altura;
    }

    public void setBase(int base){
      this.base = base;
    }

    public int getBase(){
      return this.base;
    }

    public void setAltura(int altura){
      this.altura = altura;
    }

    public int getAltura(){
      return this.altura;
    }

    public float calcularAreaTriangulo(int base,int altura){
      float area = (float)(base * altura)/2;
      return area;
    }
}