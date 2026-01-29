package POO.classinlab;
//Class Two
public class Product02 {
    private int id;
    private double price;
    private String name;
    private String category;
    private String validity;
    private int amount;

    // --- generic constructor ---
    public Product02(){
        this.price = 0.0;
        this.name = "";
        this.category = "";
        this.validity = "";
        this.amount = 0;
    }

    // --- constructor ---
    public Product02(double price, String name, String category, String validity, int amount) {
        this.id = POO.classinlab.ProductManager.ID;
        ++this.id;
        this.price = price;
        this.name = name;
        this.category = category;
        this.validity = validity;
        this.amount = amount;
    }

    // --- toString ---
    public String toString(){
        return "ID: " + this.id + " | PRICE: " + this.price + " | NAME: " + this.name + " | CATEGORY: " + this.category + " | AMOUNT: " + this.amount;
    }

    //---get---
    public  int getId(){ return this.id; }

    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    // ---set---
    public void setId(int id){
        this.id = id;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setName(String name){ this.name = name; }
}















/* <<<Class Two>>>
-> Os operadores de incremeto "++" quando utilizados em conjunto com o operador de atribuição:
   int a = 3;

   int x = ++a -> ++ pré-fixo tem MAIOR PRIORIDADE em relação a atribuição

   int x = a++ -> "++" pós-fixo a atribuição tem MAIOR PRIORIDADE,
   logo,
   x = 3;
   a = 4;


*/

/* <<<Class One>>>
-> Modificadores de acesso como "public" ou "private" são utilizados para o encapsulamento da class

-> As funções "get" e "set" devem estar atreladas a classe para ser acessada através da mesma
"""obs. id = pegar; set = modificar;"""

-> A palavra reservada "this" serve para indicar o atributo do determinado objeto
*/


