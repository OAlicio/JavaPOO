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
public class Controle {
    String cor;
    String marca;
    boolean ligado;
    
    void status(){
        System.out.println("Controle da marca " + this.marca);
        System.out.println("Da cor " + this.cor);
        System.out.println("Ele está ligado? " + this.ligado);
    }
    
    void ligar(){
        ligado = true;
    }
    
    void desligar(){
        ligado = false;
    }
    
    void utilizar(){
        if (ligado == true){
            System.out.println("Estou jogando");
        } else {
            System.out.println("Preciso ligar o controle");
        }
    }
    
}
