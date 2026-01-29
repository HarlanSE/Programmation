package Java.I_Fundamentos_Do_Java.II_Variáveis;

public class VariaveisTeste {
    public static void main(String[] args){

        //==== Tipos ====

        //inteiros
        byte ia = 127;
        short ib = 32767 ;
        int ic =  2_147_483_647;
        long id =  9_223_372_036_854_775_807L;

        //ponto flutuante
        float fa = 1.0F;
        double fb = 1.0;

        //caractere
        char a = 'a';

        //booleano
        boolean v = true;

        //==== Constantes ====

        //modificador final
        final int verdadeiro = 1;
        final int falso = 0;
        //false = 1;

        System.out.println("inteiros: \n" + ia + "\n" + ib + "\n" + ic + "\n" + id + "\n");
        System.out.println("ponto flutuante: \n" + fa + "\n" + fb + "\n");
        System.out.println("caractere: \n" + a + "\n");
        System.out.println("booleano: \n" + v + "\n");


    }
}
