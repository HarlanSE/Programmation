package Java.capacitaIrede2025.iRede.lista2ExerciciosPOO.Cap3.parte4;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new PagamentoCartao());
        pagamentos.add(new PagamentoPix());
        pagamentos.add(new PagamentoCartao());

        for (Pagamento pagamento : pagamentos) {
            pagamento.processarPagamento(150.00);
        }
    }
}
