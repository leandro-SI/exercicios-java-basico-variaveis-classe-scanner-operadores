/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Digite um numero: ");
        num1 = scan.nextInt();
        System.out.println("Digite outro numero: ");
        num2 = scan.nextInt();
        
        System.out.println("A soma dos numeros é: " + (num1 + num2));
    }
}
