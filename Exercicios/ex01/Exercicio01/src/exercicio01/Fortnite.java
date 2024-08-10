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
public class Fortnite {
    String publicadora;
    boolean loja;
    boolean jogando;
    boolean gratis;
    
    void status(){
        System.out.println("Quem publicou? " + this.publicadora);
        System.out.println("Possuí uma loja? " + this.loja);
        System.out.println("É gátis? " + this.gratis);
        System.out.println("Você está jogando? " + this.jogando);
    }
    
    void online(){
        jogando = true;
    }
    
    void offline(){
        jogando = false;
    }
    
    void jogar(){
        if (jogando == true){
            System.out.println("Estou jogando Fortnite");
        } else {
            System.out.println("Não estou online");
        }
    }
}
