/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 * 12-
 * @author Leandro
 */
public class Exercicio12 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float altura;
        float pesoIdeal;
        
        System.out.println("Digite sua altura: ");
        altura = scan.nextFloat();
        pesoIdeal = (float) (72.7 * altura) - 58;
        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
