package POO.ava.disciplinas;

public class Disciplina64 extends Disciplina {
    protected double nota2;
    protected double nota3;

    public Disciplina64(double nota1, double nota2, double nota3){
        super(nota1);
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia(){
        double media = (super.nota1 + nota2 + nota3) / 3;
        return media;
    }

}
