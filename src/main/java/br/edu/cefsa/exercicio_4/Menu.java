/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.exercicio_4;

import java.util.Queue;

/**
 *
 * @author rafae
 */
public class Menu {
    public void Printa()
    {
        System.out.println("Menu");
        System.out.println("1 - Inserir Usuário");
        System.out.println("2 - Mostra Primeiro Usuário");
        System.out.println("3 - Remove Usuário");
        System.out.println("4 - Mostra Lista");
        System.out.println("5 - Finalizar");
        System.out.println("\nDigite o número desejado: ");
    }
    public boolean Executa(int index, Queue<Usuario> fila)
    {
        Usuario usuario = new Usuario();

        switch(index)
        {
            case 1:
                fila.add(usuario.AdicionaUsuario());
                break;
            case 2:
                System.out.println("O primeiro usuário é: " +fila.peek().getNome());
                break;
            case 3:
                String nomeUsuario = fila.peek().getNome();
                
                fila.remove();
                System.out.println("O seguinte usuário foi removido: " +nomeUsuario);
                break;
            case 4:
                for (Usuario u : fila)
                    System.out.println("Nome: " +u.getNome());
                break;
            case 5:
                return false;
            default:
                System.out.println("Erro, por favor tente novamente.");
                break;
        }
        return true;
    }
}
