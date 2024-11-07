package operadores;

import java.util.Date;

public class OperatorsJava {

    String nome = "GLEYSON";
    int idade = 22;
    double peso = 68.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
    Date dataNascimento = new Date();

    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3; // calcula o resto da divisão
    double resultado = (10 * 7) + (20 / 4);



    public static void main(String[] args) {
        OperatorsJava operadores = new OperatorsJava();
        System.out.println("Nome: " + operadores.nome);
        System.out.println("Idade: " + operadores.idade);
        System.out.println("Peso: " + operadores.peso);
        System.out.println("Sexo: " + operadores.sexo);
        System.out.println("Doador de Orgão: " + operadores.doadorOrgao);
        System.out.println("Data de Nascimento: " + operadores.dataNascimento);
        System.out.println(operadores.nome.concat(" Teste Contatenação"));
        System.out.println(operadores.soma);
        System.out.println(operadores.subtração);
        System.out.println(operadores.multiplicacao);
        System.out.println(operadores.divisao);
        System.out.println(operadores.modulo);
        System.out.println(operadores.resultado);

        int numero1 = 1;
        int numero2 = 2;
        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");
        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");
        if(numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");
        if(numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");
        if(numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        String concatenacao ="?";
        concatenacao = 1+1+1+"1";
        concatenacao = 1+"1"+1+1;
        concatenacao = 1+"1"+1+"1";
        concatenacao = "1"+1+1+1;
        concatenacao = "1"+(1+1+1);

        //Operadores Unários

        int numero = +5; //ou somente 5

        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);
        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo
        System.out.println(numero);// agora sim, numero virou 7 15
        System.out.println(numero = numero ++); // atribui e soma  -- 8
        System.out.println(++numero); // atribui e soma -- 9
        //ordem de precedência conta aqui
        System.out.println(++ numero);
        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);

        int idadeUser = operadores.idade;
        int idadeMinima = 18;
        boolean maiorIdade = idadeUser >= idadeMinima;
        System.out.println(maiorIdade
                        ? operadores.nome + "é maior de idade"
                        : operadores.nome + "é menor de idade");

        /*
        Comentário de bloco
        Linhas diversas
        */

        //Comentário em linha




    }

}
