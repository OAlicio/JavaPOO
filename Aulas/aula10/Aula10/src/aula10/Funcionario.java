/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author Mavi da Vintch
 */
public class Funcionario extends Pessoa {
    //ATRIBUTOS
    
    private String setor;
    private boolean trabalhando;
    
    //METODOS
    
    public void mudarTrabalho(){
        this.trabalhando =! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    
}
