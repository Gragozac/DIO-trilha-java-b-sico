public class TiposVariaveis {
    
    public static void main(String[]args){

        Byte idade = 123;
           // É um tipo de dado numérico de 8 bits com sinal. Intervalo de valores: -128 a 127.
           
        short ano = 2021;
          /*É um tipo de dado numérico de 16 bits com sinal.
            Intervalo de valores: -32.768 a 32.767. */

        int cep = 21070333;

        /*É um tipo de dado numérico de 32 bits com sinal.
        Intervalo de valores: -2.147.483.648 a 2.147.483.647.
        */

        long cpf = 98765432109L;
        /*Descrição: É um tipo de dado numérico de 64 bits com sinal.
        Intervalo de valores: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807. */

        float pi = 3.14F;
        /*É um tipo de dado numérico de ponto flutuante de precisão simples (32 bits).
        Intervalo de valores: Aproximadamente ±3.40282347E+38F (6-7 dígitos decimais de precisão).*/

        double salario = 1275.33;
        /* É um tipo de dado numérico de ponto flutuante de precisão dupla (64 bits).
        Intervalo de valores: Aproximadamente ±1.79769313486231570E+308 (15 dígitos decimais */
            
        // Imprime os valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("CEP: " + cep);
        System.out.println("CPF: " + cpf);
        System.out.println("Pi: " + pi);
        System.out.println("Salário: " + salario);

     }
    
}
