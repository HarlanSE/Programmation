package POO.exercicioemlab2611;

public class Palavra {
    private String palavra;

    public Palavra(String palavra){
        this.palavra = palavra;
    }

    public String getNome(){ return this.palavra;}
    public void setNome(String palavra) { this.palavra = palavra; }
    
     public int contarPalavras(){
        int tamanho = this.palavra.length(),   quantidadeDePalavras = 0;
        boolean ehDento = false;

        for(int i = 0; i < tamanho; i++){
            char c = palavra.charAt(i);

            if(c != ' ' && c != '\t' && c != '\n'){
                if(!ehDento){
                    quantidadeDePalavras++;
                    ehDento = true;
                }
            }
            else{
                ehDento = false;
            }
        }

         //"UFC Russas 2025.2 Engenharia de Software"

        return quantidadeDePalavras;
    }

    public String[] retornarPalavras(){
        String palavras[] = new String[contarPalavras()];
        int base = 0, posicao;

        for(int i = 0; i < contarPalavras(); i++){
            posicao = palavra.indexOf(" ", base);

            if(posicao == -1){
                palavras[i] = palavra.substring(base);
                continue;
            }
            palavras[i] = palavra.substring(base,posicao);
            base = ++posicao;
        }

        return palavras;
    }

}

