/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author Mavi da Vintch
 */
public interface Publicacao {
    
    public abstract void abrir();
    public abstract void autor();
    public abstract void folhear(int p);
    public abstract void avancarPag();
    public abstract void voltarPag();
    
}
