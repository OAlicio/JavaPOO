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
public class Festa {
    String data;
    String hora;
    boolean traje;
    
    void status(){
        System.out.println("Qual é a data da festa? " + this.data);
        System.out.println("Que horas acontecerá? " + this.hora);
        System.out.println("Você está com os trajes próprios? " + this.traje);
    }
    
    void preparado(){
        traje = true;
    }
    
    void naopreparado(){
        traje = false;
    }
    
    void festejar(){
        if (traje = true){
            System.out.println("Hora de festejar");
        } else {
            System.out.println("Não posssuo os trajes correctos");
        }
    }
}
