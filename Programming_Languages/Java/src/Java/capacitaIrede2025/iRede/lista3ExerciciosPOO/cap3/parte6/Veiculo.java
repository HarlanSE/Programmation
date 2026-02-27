package Java.capacitaIrede2025.iRede.lista3ExerciciosPOO.cap3.parte6;

public abstract class Veiculo {

    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + " | Ano: " + ano);
    }

    // Método abstrato (não tem implementação aqui)
    public abstract void mover();
}