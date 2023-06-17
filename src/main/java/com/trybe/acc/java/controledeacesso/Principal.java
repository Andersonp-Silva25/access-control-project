package com.trybe.acc.java.controledeacesso;

import java.util.Scanner;

/**
 * Descrição da classe.
 */
public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Acessar o estabelecimento");
    System.out.println("2 - Finalizar sistema e mostar relatório");

    int option = scanner.nextInt();

    while (option != 2) {
      System.out.println("Entre com a sua idade:");
      short age = scanner.nextShort();
      Pessoa.checkAge(age);

      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostar relatório");

      option = scanner.nextInt();
    }

    scanner.close();
  }
}
