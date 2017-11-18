/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 * 2- Faça um programa que peça um número e então mostre a mensagem
 * O número informado foi [número].
 * @author Leandro
 */
public class Exercicio2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        
        System.out.println("O número informado foi: " + "[" + num + "]");
    }
    
    
}
