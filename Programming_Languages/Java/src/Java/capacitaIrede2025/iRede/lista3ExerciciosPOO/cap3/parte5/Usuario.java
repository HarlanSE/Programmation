package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte5;

public class Usuario implements Autenticavel {

    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    public String getNome() {
        return nome;
    }
}