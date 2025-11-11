package ClassInLab;

public class Product01 {
    private int id;
    private double price;
    private String name;
    private String category;
    private String validity;
    private int amount;

    public Product01(int id, double price, String name, String category, String validity, int amount) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
        this.validity = validity;
        this.amount = amount;
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

/*
-> Modificadores de acesso como "public" ou "private" são utilizados para o encapsulamento da class

-> As funções "get" e "set" devem estar atreladas a classe para ser acessada através da mesma
"""obs. id = pegar; set = modificar;"""

-> A palavra reservada "this" serve para indicar o atributo do determinado objeto
*/


