/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author Mavi da Vintch
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Objeto garrafa
        Garrafa g1 = new Garrafa();
        g1.cor = "Translúcida";
        g1.liquido = "Água";
        g1.capacidade = 1.5f;
        g1.destampar();
        g1.status();
        g1.beber();
        
        //Objeto controle
        System.out.println("---------------------");
        Controle ps4 = new Controle();
        ps4.cor = "Branco";
        ps4.marca = "Sony";
        ps4.ligar();
        ps4.status();
        ps4.utilizar();
        
        //Objeto jogo
        System.out.println("---------------------");
        Fortnite epic = new Fortnite();
        epic.gratis = true;
        epic.loja = true;
        epic.publicadora = "Epic Games";
        epic.online();
        epic.status();
        epic.jogar();
        
        //Objeto festa
        System.out.println("---------------------");
        Festa aniversario = new Festa();
        aniversario.data = "12/08/2024";
        aniversario.hora = "18:00";
        aniversario.preparado();
        aniversario.status();
        aniversario.festejar();
    }
    
}
