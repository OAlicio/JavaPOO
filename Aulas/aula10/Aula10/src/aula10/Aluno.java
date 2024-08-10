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
public class Aluno extends Pessoa {
    //ATRIBUTOS
    
    private boolean matr;
    private String curso;
    
    //MÉTODOS
    
    public void fazerMatr() {
        this.matr = true;
    }
    
    public void cancelarMatr() {
        this.matr = false;
    }
    
    //MÉTODOS ESPECIAIS:

    public boolean getMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
