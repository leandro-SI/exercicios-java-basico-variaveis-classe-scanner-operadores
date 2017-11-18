/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Date;
import java.util.Scanner;

/**
 * 6- Faça um programa que peça o raio de um circulo, calcule e mostre sua área. 
 * @author Leandro
 */
public class Exercicio6 {
    
    /**
     * pi - atributo estático para armazenar o valor de PI.
     */
    public static double pi = 3.14;
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double raio, area;
        
        System.out.println("Digite o raio: ");
        raio = scan.nextDouble();
        area = pi * Math.pow(raio, 2);
        
        System.out.println("A área do circulo é: " + area);
    }
}
