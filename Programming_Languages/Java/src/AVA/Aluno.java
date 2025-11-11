package AVA;
//Model

//Cada classe: [aluno] deve possuir Atributos: [nome, matricula, idade, média, período, sexo(M/F))
// situação (aprovado, final e reprovado) ], entre outros.

public class Aluno {
    private int matricula;
    private String nome;
    private int idade;
    private int periodo;
    private float media;
    private char sexo;
    private boolean situacao;

    //construtor
    public Aluno(String nome, int idade, int periodo, float media, char sexo, boolean situacao) {
        this.matricula = Gerenciamento.MATRICULA;
        ++Gerenciamento.MATRICULA;
        this.nome = nome;
        this.idade = idade;
        this.periodo = periodo;
        this.media = media;
        this.sexo = sexo;
        this.situacao = situacao;
    }

    //Gets
    public String getNome(){ return this.nome; }
    public int getMatricula(){ return this.matricula; }
    public int getidade(){ return this.idade; }
    public int getPeriodo(){ return this.periodo; }
    public float getmedia(){ return this.media; }
    public char getSexo(){ return this.sexo; }
    public boolean getSituacao(){ return this.situacao; }

    //sets
    public void setNome(String nome){ this.nome = nome; }
    public void setMatricula(int matricula) { this.matricula = matricula; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setPeriodo(int periodo) { this.periodo = periodo; }
    public void setMedia(float media) { this.media = media; }
    public void setSexo(char sexo) { this.sexo = sexo; }
    public void setSituacao(boolean situacao) { this.situacao = situacao; }

    public String toString(){
        String situacao;
        if(this.situacao){
            situacao = "Aprovado(a)";
        } else {
             situacao = "Reprovado(a)";
        }

        return " Nome: " + this.nome + " Matricula: " + this.matricula + " Idade: " + this.idade + " Periodo: " + this.periodo + " Média: " + this.media + " Sexo: " + this.sexo + " Situacao: " + situacao + "\n";
    }
}