public class Data {
  private int dia;
  private int mes;
  private int ano;
  
  public Data(int dia,int mes,int ano){
    this.dia = 0;
    this.mes = 0;
    this.ano = 0;
  }

  public void setDia(int dia){
    this.dia = dia;
  }

  public int getDia(){
    return this.dia;
  }
  
  public void setMes(int mes){
    this.mes = mes;
  }

  public int getMes(){
    return this.mes;
  }

  public void setAno(int ano){
    this.ano = ano;
  }

  public int getAno(){
    return this.ano;
  }

  public String displayData(int dia,int mes,int ano){
    String data = String.format("%d/%d/%d",this.getDia(),this.getMes(),this.getAno());
    return data;
  }
  
}