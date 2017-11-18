/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 * 4- Faça um programa que peça as 4 notas bimestrais e mostre a média.
 * @author Leandro
 */
public class Exercicio4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        /**
         * Usar vírgula para separar casas decimais, em atributos do tipo float.
         */
        float nota1F, nota2F, nota3F, nota4F, mediaF;
        
        System.out.println("Digite a nota 1: ");
        nota1F = scan.nextFloat();
        System.out.println("Digite a nota 2: ");
        nota2F = scan.nextFloat();
        System.out.println("Digite a nota 3: ");
        nota3F = scan.nextFloat();
        System.out.println("Digite a nota 4: ");
        nota4F = scan.nextFloat();
        
        mediaF = (nota1F + nota2F + nota3F + nota4F) / 4;
        
        System.out.println("A media das notas é: " + mediaF);
    }
}
