/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

import java.util.Scanner;

/**
 *
 * @author anibal
 */
public class Exercicio2 {
        public static void main(String[] args){
            
            /**
             * 2.Faça um programa que receba a idade de uma pessoa em anos, calcule e imprima
              essa idade 
             */
            
            int idade;
            int meses=12;
            int diasDoAno =365;
            double horas =24;
            int minutos =60;
           
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Escreva a sua Idade; ");
            idade = scan.nextInt();
            
            
            
            meses*= idade;
            diasDoAno*=idade;
            horas = diasDoAno *(horas/1);
            minutos*=horas;
            
            System.out.println("Tens "+meses+" meses De vida ");
            System.out.println("Tens "+diasDoAno+" dias De vida ");
            System.out.println("Tens "+horas+" horas De vida ");
            System.out.println("Tens "+minutos+" minutos De vida ");
            
        }
}
