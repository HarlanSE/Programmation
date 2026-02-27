package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte5;

public class Main {
    public static void main(String[] args) {

        Autenticavel usuario = new Usuario("Carlos", "1234");
        Autenticavel admin = new Administrador("Ana", "admin123");

        System.out.println("Autenticando usuário:");
        System.out.println(usuario.autenticar("1234")); // true

        System.out.println("\nAutenticando administrador:");
        System.out.println(admin.autenticar("admin123")); // true

        System.out.println("\nTentativa inválida admin:");
        System.out.println(admin.autenticar("123")); // false
    }
}
