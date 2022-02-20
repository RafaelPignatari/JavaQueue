/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.cefsa.exercicio_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Usuario> fila = new LinkedList<Usuario>();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);       
        boolean continua = true;
        
        do
        {
            try
            {
                menu.Printa();
                continua = menu.Executa(scanner.nextInt(), fila);
            }
            catch(Exception erro)
            {
                System.out.println("Erro: " +erro.getMessage());
                System.out.println("Tente novamente.");
                continua = false;
            }
        } while(continua);
        
    }
    
}
