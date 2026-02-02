package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.Cap1;

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto("chocolate", 9.99, 97);

        System.out.println("produto antes da mudança: \n" + produto.toString());

        produto.setNome("Amendoim");
        produto.setpreco(15.99);
        produto.setQuantidadeEstoque(50);

        System.out.println("produto depois da mudança: \n" + produto.toString());
    }

}
