/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 * 7- Faça um programa que calcule a área de um quadrado, em seguida mostre o
 * dobro desta área para o usuário.
 * @author Leandro
 */
public class Exercicio7 {
    
        public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);
            double area;
            
            System.out.println("Digite o lado do quadrado: ");
            double lado = scan.nextDouble();
            area = lado * lado;
            System.out.println("A área do quadrado é: " + area);
            System.out.println("O dobro da área do quadrado é: " + (area* 2));
            
    }
  
}
