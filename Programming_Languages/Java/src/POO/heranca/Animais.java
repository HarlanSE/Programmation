package POO.heranca;

public class Animais {
   protected int idade;
   protected double peso;
   protected double altura;
   protected String cor;
   protected String sexo;

   public Animais(){
       this.idade = 0;
       this.peso = 0;
       this.altura = 0;
       this.cor = " ";
       this.sexo = " ";
   }

   public Animais(int idade, double peso, double altura, String cor, String sexo){
       this.idade = idade;
       this.peso = peso;
       this.altura = altura;
       this.cor = cor;
       this.sexo = sexo;
   }

   public void emitirSom(){
       System.out.println("som");;
   }

    public int getIdade() { return this.idade; }
    public double getPeso() { return this.peso; }
    public double getAltura() { return this.altura; }
    public String getCor(){ return this.cor; }
    public String getSexo() { return this.sexo; }

    public void setIdade(int idade) { this.idade = idade; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setAltura(double altura) { this.altura = altura; }
    public void setCor(String cor) { this.cor = cor; }
    public void setSexo(String sexo) { this.sexo = sexo; }
}
