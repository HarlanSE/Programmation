package Tests;

import javax.swing.*;

public class Veiculo{
    private String type;
    private String modelo;
    private double value;

    public Veiculo(){
        this.type = "Tipo padrão";
        this.modelo = "Modelo padrão";
        this.value = 10.00;
    }

    //getters
    public void getInformations(){ System.out.printf("%s \n%s \n%.2f", this.type, this.modelo, this.value); }

    public String getType(){ return this.type; }
    public String getModelo(){ return this.modelo; }
    public double getValue(){ return this.value; }

    //setters
    public void setType(String type){ this.type = type; }
    public void setModelo(String modelo){ this.modelo = modelo; }
    public void setValue(double value){ this.value = value; }

    public void setInformations(){

        JOptionPane.showInputDialog("Type:", type);

        this.type = type;
//        this.modelo = modelo;
//        this.value = value;
    }
}