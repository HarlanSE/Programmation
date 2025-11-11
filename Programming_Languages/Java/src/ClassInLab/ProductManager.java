package ClassInLab;

import java.sql.SQLOutput;

//Class Two
public class ProductManager {
    private Product02 products[];
    private int id;
    static public int ID = 0;

    // --- Constructor ---
    public ProductManager() {
        this.products = new Product02[5];
        this.id = 0;
    }

    // --- ADD PRODUCTS ---
    public void addProduct(double price, String name, String category, String validity, int amount) {
        if (this.id < 5) {
            Product02 newP = new Product02(price, name, category, validity, amount);
            products[this.id] = newP;
            ++this.id;
        } else {
            System.out.printf("O estoque do sistema está com capacidade máxima: %d \n", this.id);
        }

        // OBS. ID serve para me dar a QUANTIDADE de elementos que tenho e o INDICE do PROX. el.
    }

    //LIST PRODUCTS
    public void listProducts() {
        for (int i = 0; i < this.id; i++) {
            System.out.println(this.products[i].toString());
            //System.out.println(products[i]);
        }
    }
}











// <<< Arquitetura MVC>>>
// MODEL
// VIEW
// CONTROLLER
//Uma classe Controller, contém como atributo um vetor de Objetos;
// Estabelece a comunicação entre as classes Model e View;
