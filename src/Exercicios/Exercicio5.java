/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 * 5- Faça um programa que converta em metros para centímetros.
 * @author Leandro
 */
public class Exercicio5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        float metros, centimetros;
        
        System.out.println("Digite em metros para converter em cenímetros: ");
        metros = scan.nextFloat();
        centimetros = metros * 60;
        
        System.out.println(metros + " Metros tem " + centimetros + " Centímetros.");
    }
}
