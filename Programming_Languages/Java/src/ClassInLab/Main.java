package ClassInLab;
// Sugestão de IDE - NetBeans

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//<<< Parte Two >>>
        ProductManager manager = new ProductManager();
        manager.addProduct(2999.99, "TV", "Eletronics", "Indeterminated", 10);
        manager.addProduct(150.99, "Monitor", "Eletronics", "Indeterminated", 25);
        manager.listProducts();
    }
}













/*
<< Para iniciar um main no Java é necessário criar uma classe Main: >>
    public class Main{

    << Dentro dessa classe pode-se criar a função main:  >>

        public static void main(String[] args){

        } //Fechamento da função main
    } //fechamento da classe Main
*/