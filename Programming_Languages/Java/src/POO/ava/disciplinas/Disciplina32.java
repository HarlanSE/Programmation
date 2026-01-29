package POO.ava.disciplinas;

public class Disciplina32 extends Disciplina {
    protected double nota2;

    public Disciplina32(double nota1, double nota2){
        super(nota1);
        this.nota2 = nota2;
    }


    public double calcularMedia(){
        double media = (super.nota1 + nota2) / 2;
        return media;
    }

}
