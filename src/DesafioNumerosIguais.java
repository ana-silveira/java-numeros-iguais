/*
Nesse desafio, dados dois números, verifique se eles são iguais.
Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas.
Entrada
As entradas serão dois valores, um em cada linha, representados por A e B, que serão sempre números inteiros.
Saída
A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor.
Caso contrário, retorne "Nao sao iguais!", sem as aspas.
 */

import java.util.*;

public class DesafioNumerosIguais  {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //System.out.print("Insira o valor de A: ");
        int a = leitor.nextInt();
        //System.out.print("Insira o valor de B: ");
        int b = leitor.nextInt();

        System.out.println( a == b ? "Sao iguais!" : "Nao sao iguais! ");

    }
}