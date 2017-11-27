/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 * 10- Faça im programa que peça a temperatura em graus Celsius, transforme
 * e mostre em graus Farenheit.
 * @author Leandro
 */
public class Exercicio10 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float grausFarenheit;
        float grausCelsius;
        
        System.out.println("Digite a temperatura em graus Celsius: ");
        grausCelsius = scan.nextFloat();
        grausFarenheit = (float) ((grausCelsius * 1.8) + 32);
        System.out.println("A temperatura em Farenheit é: " + grausFarenheit);
        
    }
}
