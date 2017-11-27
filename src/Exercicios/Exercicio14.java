/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 * 14-
 * @author Leandro
 */
public class Exercicio14 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int tamanhoArquivo;
        int velocidadeLink;
        int tempo;
        
        System.out.println("Digite o tamanho do arquivo (em MB) para download: ");
        tamanhoArquivo = scan.nextInt();
        System.out.println("Digite a velocidade do link de internet (em Mbps): ");
        velocidadeLink = scan.nextInt();
        tempo = tamanhoArquivo / velocidadeLink;
        System.out.println("Tempo de download: " + tempo);
        
        
    }
}
