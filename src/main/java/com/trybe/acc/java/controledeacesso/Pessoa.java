package com.trybe.acc.java.controledeacesso;

/**
 * Método principal.
 */
public class Pessoa {

  /**
   * Método para verificar a idade do usuario.
   */
  public static void checkAge(short age) {
    if (age < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
    } else if (age < 50) {
      System.out.println("Pessoa adulta, catraca liberada!");
    } else {
      System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
    }
  }

  /**
   * Método para gerar o relatorio com a quantidade de pessoas e as porcentagens.
   */
  public static void report(int[] count) {
    double totalPeople = count[0] + count[1] + count[2];
    double percentageMenores = (count[0] / totalPeople) * 100;
    double percentageAdultas = (count[1] / totalPeople) * 100;
    double percentageMaiores = (count[2] / totalPeople) * 100;

    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + count[0]);
    System.out.println("adultas: " + count[1]);
    System.out.println("a partir de 50: " + count[2]);

    System.out.println("----- Percentual -----");
    System.out.println("menores: " + percentageMenores + "%");
    System.out.println("adultas: " + percentageAdultas + "%");
    System.out.println("a partir de 50: " + percentageMaiores + "%");

    System.out.println("Total: " + totalPeople);
  }
}
