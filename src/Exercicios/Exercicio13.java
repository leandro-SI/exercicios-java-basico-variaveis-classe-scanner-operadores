/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 * 13-
 * @author Leandro
 */
public class Exercicio13 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float ganhoHora;
        float horaMes;
        float IR;
        float INSS;
        float sindicado;
        float totalBruto;
        
        System.out.println("Quanto ganha por hora: ");
        ganhoHora = scan.nextFloat();
        System.out.println("Quantas horas trabalhada: ");
        horaMes = scan.nextFloat();
        totalBruto = ganhoHora * horaMes;
        IR = (float) (totalBruto * 0.11);
        INSS = (float) (totalBruto * 0.08);
        sindicado = (float) (totalBruto * 0.05);
        System.out.println("Salario bruto: " + totalBruto);
        System.out.println("Pago em INSS: " + INSS);
        System.out.println("Pago ao Sindicato: " + sindicado);
        System.out.println("Salario Liquido: " + (totalBruto - (IR + INSS + sindicado)));
        
                
        
    }
}
