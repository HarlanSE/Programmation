package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.Cap3.parte4;

public class PagamentoPix extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Pix: R$ " + valor);
    }
}