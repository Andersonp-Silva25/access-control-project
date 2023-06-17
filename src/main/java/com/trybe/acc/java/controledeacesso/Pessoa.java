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
}
