/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Mavi da Vintch
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //POLIMORFISMO DE SOBREPOSIÇÃO:
        
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        //MAMÍFERO
        m.setPeso(5.70f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover(); //CORRENDO
        m.alimentar(); //MAMANDO
        m.emitirSom(); //SOM DE MAMÍFERO
        
        //PEIXE
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover(); //NADANDO
        p.alimentar(); //COMENDO MICRO-ORGANISMOS
        p.emitirSom(); //PEIXE NÃO FAZ SOM
        p.soltarBolha();
        
        //AVE
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover(); //VOANDO
        a.alimentar(); //COMENDO FRUTAS
        a.emitirSom(); //SOM DE AVE
        a.fazerNinho();
        
        //---------------------------------------------------//
        System.out.println("---------------------------------");
        Canguru k = new Canguru();
        Cachorro c = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        k.setPeso(55.30f);
        k.setIdade(3);
        k.setMembros(4);
        k.locomover(); //SALTANDO
        k.alimentar(); //MAMANDO
        k.emitirSom(); //SOM DE MAMÍFERO
        k.usarBolsa();
        
        c.setPeso(3.94f);
        c.setIdade(5);
        c.setMembros(4);
        c.locomover(); //CORRENDO
        c.alimentar(); //MAMANDO
        c.emitirSom(); //LATINDO
        c.abanarRabo();
        c.enterrarOsso();
        
    }
    
}
