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
public class Garrafa {
    String cor;
    String liquido;
    float capacidade;
    boolean tampar;
    
    void status(){
        System.out.println("A garrafa é da cor " + this.cor);
        System.out.println("Com a função de armazenar " + this.liquido);
        System.out.println("Com uma capacidade de " + this.capacidade + "L");
        System.out.println("E está tampada? " + this.tampar);
    }  
    
    void tampar(){
        tampar = true;
    }
    
    void destampar(){
        tampar = false;
    }
    
    void beber(){
        if (tampar == false){
            System.out.println("Estou bebendo");
        } else {
            System.out.println("Preciso destampar a garrafa");
        }
    }
    
}
