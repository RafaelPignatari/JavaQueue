/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.cefsa.exercicio_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Usuario {
    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    
    public String getNome() {
        return nome;
    }
    public Usuario AdicionaUsuario()
    {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Digite o nome do usuário: ");    
        usuario.nome = scanner.next();

        System.out.println("Digite o rg do usuário: ");    
        usuario.rg = scanner.next();

        System.out.println("Digite o cpf do usuário: ");    
        usuario.cpf = scanner.next();

        System.out.println("Digite a data de nascimento do usuário: ");    
        usuario.dataNascimento = LocalDate.parse(scanner.next(), formatoData);

        return usuario;
    }
}
