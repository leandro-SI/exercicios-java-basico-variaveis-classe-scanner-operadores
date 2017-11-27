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
public class Exercicio11 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        float num3;
        
        System.out.println("Digite o primeiro numero: ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = scan.nextInt();
        System.out.println("Digite o terceiro numero: ");
        num3 = scan.nextFloat();
        
        System.out.println("produto do dobro do primeiro com metado do segundo: " + ((2*num1) * (num2/2)));
        System.out.println("Soma do triplo do primeiro com o terceiro: " + ((3*num1) + (num3)));
        System.out.println("Terceiro elevado ao cubo: " + Math.pow(num3, 3));
    }
}
