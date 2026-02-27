package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte5;

public class Administrador implements Autenticavel {

    private String nome;
    private String senha;

    public Administrador(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {

        if (senha.length() < 8) {
            System.out.println("Senha do administrador deve ter no mínimo 8 caracteres.");
            return false;
        }

        return this.senha.equals(senha);
    }

    public String getNome() {
        return nome;
    }
}
