package Java.I_Fundamentos_Do_Java.II_Variáveis.I_Tipos_Primitivos;

/**
 * -------------------------------------------
 *     DOCUMENTAÇÃO SOBRE IDENTIFICADORES
 * -------------------------------------------
 *
 * ----- SINTAXE EM EBNF SIMPLIFICADA -----:
 *
 *      Identificador ::= Inicio , { Continuação } ;
 *      Inicio ::= Letra | "_" | "$" ;
 *      Continuação ::= Inicio | Digito | Conector | Combinação | NãoEspaçada ;
 *      Letra ::= caractere Unicode das categorias: Lu | Ll | Lt | Lm | Lo | Nl ;
 *      Digito ::= caractere Unicode da categoria: Nd ;
 *      Conector ::= caractere Unicode da categoria: Pc ;      // inclui "_"
 *      Combinação ::= caractere Unicode das categorias: Mc | Mn ;
 *      NãoEspaçada ::= caractere Unicode da categoria: Mn ;
 *
 *
 * <<< OBS. Java é CASE SENSITIVE, isto é, faz diferenciação entre letras minúsculas e maiúsculas >>>
 *
 * ----- CONVEÇÕES DA JCP -----:
 *
 * camelCase:  Todas as palavras começam com letras com letra maiúscula, exceto a primeira
 * pascalCase: Todas as palavras começam com letras com letra maiúscula.
 *
 * 1.Variáveis:
 * ✔ Começam com letra minúscula
 * ✔ Usam camelCase
 * ✔ Devem ser descritivas
 *
 * 2. Métodos:
 * ✔ Começam com letra minúscula
 * ✔ Usam camelCase
 * ✔ Devem expressar uma ação (verbo)
 * ✔ Nomes claros e imperativos
 *
 * 3. Classes:
 * ✔ Começam com letra maiúscula
 * ✔ Usam PascalCase
 * ✔ São substantivos
 *
 * 4. Atributos:
 * ✔ Iguais às variáveis
 * ✔ Em camelCase
 * ✔ Se private, podem vir com prefixo opcional não recomendado (ex: _idade)
 *
 * 5. Interfaces:
 * ✔ Também usam PascalCase
 * ✔ Geralmente descrevem uma habilidade ou contrato
 * ✔ Muitos começam com adjetivo
 *
 * 6. Constantes:
 * ✔ Devem ser static final
 * ✔ Usam todas as letras maiúsculas
 * ✔ Palavras separadas por _
 *
 * 7. Pacotes:
 * ✔ Sempre letras minúsculas
 * ✔ Evitar underline
 * ✔ Organização invertida do domínio (opcional em projetos pequenos)
 *
 * 8. Enumerações:
 * ✔ Usam PascalCase no nome do enum
 * ✔ Cada valor é MAIÚSCULO, como constante
 *
 * TESTE:
 * public class DocIdentificadores {
 *     private int $inteiroغא;
 *     private int Int£¤ĀɸƱΣͽ;
 *     private float _pontoFlutuanteʤ;
 *
 *     public DocIdentificadores(int a, int b){
 *         this.$inteiroغא = a;
 *         this.Int£¤ĀɸƱΣͽ = b;
 *     }
 *
 *     public int get$inteiroغא() {return $inteiroغא;}
 *     public int getInt£¤ĀɸƱΣͽ(){return Int£¤ĀɸƱΣͽ;}
 * }
 *
 */


