/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 * 8- Faça um programa que pergunte quanto você ganha por hora e o numero
 * de horas trabalhada no mês. Calcule e mostre o total do seu salário no
 * referido mês.
 * @author Leandro
 */
public class Exercicio8 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double ganhoHora;
        double horasTrabalhada;
        double totalSalario;
        
        System.out.println("Quanto ganha por hora: ");
        ganhoHora = scan.nextDouble();
        System.out.println("Numero de horas trabalhada: ");
        horasTrabalhada = scan.nextDouble();
        totalSalario = horasTrabalhada* ganhoHora;
        System.out.println("Seu salário mensal é: " + totalSalario);
        
        
    }
}
