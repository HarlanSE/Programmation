package Java.I_Fundamentos_Do_Java.II_Variáveis.I_Tipos_Primitivos;

/**
 * ===============================================================
 *           DOCUMENTAÇÃO SOBRE TIPOS PRIMITIVOS EM JAVA
 * ===============================================================
 *
 * Em Java existem oito tipos primitivos, divididos em categorias:
 *
 * ---------------------------------------------------------------
 * 1) TIPOS INTEIROS
 * ---------------------------------------------------------------
 *
 * byte   → 8 bits
 * short  → 16 bits
 * int    → 32 bits   (tipo inteiro padrão)
 * long   → 64 bits   (usa sufixo L para literais)
 *
 * ---------------------------------------------------------------
 * 2) TIPOS DE PONTO FLUTUANTE
 * ---------------------------------------------------------------
 *
 * float  → 32 bits   (precisa de sufixo F)
 * double → 64 bits   (tipo decimal padrão)
 *
 * ---------------------------------------------------------------
 * 3) CARACTERE
 * ---------------------------------------------------------------
 *
 * char   → 16 bits (representa 1 código Unicode)
 *
 * ---------------------------------------------------------------
 * 4) BOOLEANO
 * ---------------------------------------------------------------
 *
 * boolean → true / false
 *
 * ---------------------------------------------------------------
 *
 *   Exemplo:
 *
 *   long inteiroA = 10l; //Aqui a variável é declarada com long, mas o seu valor declarado
 *   seria int, o que necessitaria de um (casting widening) para só depois ser atribuído.
 *
 *   float pontoflutuante = 4.3f; // Aqui a variável é declarada como float, mas seu valor
 *   declarado seria double, o que de um (casting narrowing) para só depois ser atribuído.
 *   Cujo, caso não seja feito, provocaria erro de compilação.
 *
 * ===============================================================
 *                    TABELA GERAL DOS TIPOS
 * ===============================================================
 *
 *
 *  Tipo     | Tamanho | Intervalo aproximado               | Exemplo literal
 * ----------|----------|-------------------------------------|---------------------------
 *  byte     | 8 bits   | -128 a 127                          | byte b = 10;
 *  short    | 16 bits  | -32.768 a 32.767                    | short s = 1000;
 *  int      | 32 bits  | -2 bi a 2 bi                        | int x = 50;
 *  long     | 64 bits  | Entre -5 bi e 5 bi                  | long n = 99999L;
 *  float    | 32 bits  | ~7 dígitos decimais                 | float f = 3.14F;
 *  double   | 64 bits  | ~15 dígitos decimais                | double d = 2.71828;
 *  char     | 16 bits  | '\u0000' a '\uFFFF' (Unicode)       | char c = 'A';
 *  boolean  | 1 bit*   | true ou false                       | boolean ok = true;
 *
 * ===============================================================
 *             VALORES PADRÃO PARA ATRIBUTOS DE CLASSE
 * ===============================================================
 *
 *  Tipo primitivo → valor quando NÃO inicializado:
 *
 *  byte     → 0
 *  short    → 0
 *  int      → 0
 *  long     → 0
 *  float    → 0.0f
 *  double   → 0.0d
 *  char     → '\u0000'  (NULL Unicode)
 *  boolean  → false
 *
 * ===============================================================
 *                      LITERAIS NUMÉRICOS
 * ===============================================================
 *
 * Decimais:
 *     int x = 42;
 *
 * Binários (prefixo 0b):
 *     int b = 0b1010;
 *
 * Hexadecimais (prefixo 0x):
 *     int h = 0xFF;    // 255
 *
 * Underscore para facilitar leitura:
 *     int grande = 1_000_000;
 *
 * Float precisa do sufixo F:
 *     float pi = 3.14F;
 *
 * Long precisa do sufixo L:
 *     long id = 123456789L;
 *
 * ===============================================================
 *     DIFERENÇA ENTRE TIPOS PRIMITIVOS E SUAS CLASSES WRAPPER
 * ===============================================================
 *
 *  Primitivo   → Wrapper
 *  int         → Integer
 *  double      → Double
 *  boolean     → Boolean
 *  char        → Character
 *  etc.
 *
 * Usados em:
 *  - Collections (List, Map, Set)
 *  - generics
 *  - métodos utilitários
 *
 * Exemplos:
 *
 * Autoboxing (primitivo → wrapper):
 *     Integer x = 10;      // Java converte automaticamente
 *
 * Unboxing (wrapper → primitivo):
 *     int y = x;           // também automático
 *
 * ===============================================================
 *                  CHAR × STRING — DIFERENÇA
 * ===============================================================
 *
 * char    → um único caractere (Unicode)
 * String  → sequência de caracteres
 *
 * Exemplos:
 *
 *     char c = 'A';     // aspas simples
 *     String s = "A";   // aspas duplas
 *
 * ===============================================================
 *            POR QUE JAVA POSSUI TIPOS PRIMITIVOS?
 * ===============================================================
 *
 * 1) Performance (mais rápido que objetos)
 * 2) Economia de memória
 * 3) Interoperabilidade com a JVM
 * 4) Simplicidade da linguagem
 *
 * ===============================================================
 *           SPOILER: OPERADORES ÚTEIS PARA TIPOS PRIMITIVOS
 * ===============================================================
 *
 * Incremento/decremento:
 *     x++;
 *     --y;
 *
 * Divisão inteira:
 *     7 / 2 = 3
 *
 * Resto:
 *     7 % 2 = 1
 *
 * Operadores bitwise(bit a bit) para inteiros:
 *     & (E)   | (OU)   ^ (XOR)   ~ (NOT)
 *     << (shift left)    >> (shift right)
 *
 * ===============================================================
 *                    FIM DA DOCUMENTAÇÃO
 * ===============================================================
 */

