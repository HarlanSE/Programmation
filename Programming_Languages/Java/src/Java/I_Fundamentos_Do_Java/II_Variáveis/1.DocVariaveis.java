package Java.I_Fundamentos_Do_Java.II_Variáveis;

/**
 * ===============================================================
 *                     DOCUMENTAÇÃO — VARIÁVEIS
 * ===============================================================
 *
 * ► Em Java, *variáveis são abstrações que representam células de memória*.
 *   Elas armazenam valores usados durante a execução do programa.
 *
 * ---------------------------------------------------------------
 *                  COMPONENTES DE UMA VARIÁVEL
 * ---------------------------------------------------------------
 *
 * 1) **Identificador**
 *      Nome dado à variável.
 *      - Deve seguir as regras de identificadores do Java.
 *      - Recomenda-se camelCase.
 *
 * 2) **Endereço**
 *      Local na memória onde o valor está armazenado.
 *      - Não é acessível diretamente pelo programador (abstraído pela JVM).
 *
 * 3) **Tipo**
 *      Determina:
 *      - Tamanho da memória usada
 *      - Operações permitidas
 *      - Faixa de valores
 *
 *      Tipos podem ser:
 *         ● Primitivos (int, double, boolean...)
 *         ● Referência (String, arrays, objetos...)
 *
 * 4) **Valor**
 *      Conteúdo armazenado na variável.
 *      - Pode ser alterado enquanto a variável estiver no escopo.
 *
 * 5) **Escopo**
 *      Região do código onde a variável é visível e acessível.
 *
 *      Tipos de escopo:
 *        ● LOCAL      → dentro de métodos, blocos, loops
 *        ● DE CLASSE  → atributos estáticos
 *        ● DE INSTÂNCIA → atributos do objeto
 *        ● DE BLOCO   → dentro de { }
 *
 * 6) **Tempo de vida**
 *      Quanto tempo a variável permanece na memória.
 *
 *      - Variáveis locais: enquanto o método está sendo executado.
 *      - Variáveis de instância: enquanto existir a instância do objeto.
 *      - Variáveis estáticas: durante toda a execução do programa.
 *
 * ===============================================================
 *                 DECLARAÇÃO E ATRIBUIÇÃO DE VARIÁVEIS
 * ===============================================================
 *
 *   Declaração:
 *       int idade;
 *
 *   Atribuição:
 *       idade = 20;
 *
 *   Declaração + atribuição:
 *       int idade = 20;
 *
 * ===============================================================
 *                   TIPOS DE DECLARAÇÃO EM JAVA
 * ===============================================================
 *
 * 1) **Variável Local**
 *      - Declarada dentro de métodos/blocos.
 *      - Deve ser inicializada antes do uso.
 *
 * 2) **Variável de Instância**
 *      - Declarada na classe (mas fora de métodos).
 *      - Cada objeto tem sua cópia.
 *
 * 3) **Variável Estática**
 *      - Declarada com `static`.
 *      - Pertence à classe, não ao objeto.
 *
 * ===============================================================
 *                      CONSTANTES EM JAVA
 * ===============================================================
 *
 * ● Usam `final`
 * ● Não podem ter seu valor alterado após inicialização
 * ● Convenção: NOME_TODO_EM_MAIÚSCULAS
 *
 * Exemplo:
 *      final double PI = 3.14159;
 *
 * ===============================================================
 *                     INICIALIZAÇÃO PADRÃO
 * ===============================================================
 *
 * Variáveis **locais não têm valor padrão**.
 * A JVM exige inicialização manual.
 *
 * Variáveis de **classe e instância** possuem valores padrão:
 *      int     → 0
 *      double  → 0.0
 *      boolean → false
 *      char    → '\u0000'
 *      objetos → null
 *
 * ===============================================================
 *            VARIÁVEIS DE REFERÊNCIA VS VARIÁVEIS PRIMITIVAS
 * ===============================================================
 *
 * ► Tipos primitivos armazenam **valores** diretamente.
 * ► Variáveis de referência armazenam **endereços** (referem-se a objetos).
 *
 * Exemplos:
 *
 *      int n = 10;                // armazena o valor 10
 *
 *      String nome = "Ana";       // armazena uma referência para um objeto String
 *
 * ===============================================================
 *                      SOMBREAMENTO (SHADOWING)
 * ===============================================================
 *
 * Acontece quando uma variável local tem o mesmo nome de uma variável de instância.
 *
 *      int x = 10;  // variável da classe
 *
 *      void metodo() {
 *          int x = 5;   // esta "sombra" a variável da classe
 *      }
 *
 * ===============================================================
 *                            HOISTING?
 * ===============================================================
 *
 * ► Java **não possui hoisting** como JavaScript.
 * ► Variáveis devem ser declaradas antes do uso.
 *
 * ===============================================================
 *                        BOAS PRÁTICAS DE USO
 * ===============================================================
 *
 * ✔ Use nomes claros e significativos
 * ✔ Siga convenções (camelCase)
 * ✔ Mantenha escopo o menor possível
 * ✔ Inicialize variáveis próximas ao uso
 * ✔ Prefira `final` quando o valor não deve mudar
 *
 * ===============================================================
 *                      FIM DA DOCUMENTAÇÃO
 * ===============================================================
 */



