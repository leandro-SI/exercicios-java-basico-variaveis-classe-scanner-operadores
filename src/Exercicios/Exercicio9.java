/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 * 9- Faça um programa que peça a temperatura em graus Farenheit, tranforme
 * e mostre a temperatura em graus Celsius.
 * @author Leandro
 */
public class Exercicio9 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float grausFarenheit;
        float grausCelsius;
        
        System.out.println("Digite a temperatura em Graus Farenheit");
        grausFarenheit = scan.nextFloat();
        grausCelsius = (5 * (grausFarenheit - 32) / 9);
        System.out.println("A temperatura em Graus Celsius é: " + grausCelsius);
    }
}
