/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author Mavi da Vintch
 */
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[0].play();
        v[1] = new Video("Aula 12 de PHP");
        v[1].play();
        v[2] = new Video("Aula 10 de HTML5"); 
        v[2].play();
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);//JUBILEU ASSISTE HTML5
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        
        vis[1] = new Visualizacao(g[0], v[1]);//JUBILEU ASSISTE PHP
        vis[1].avaliar(87.0f);
        vis[1].curtir();
        System.out.println(vis[1].toString());
        
        /*System.out.println("VIDEOS\n-------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("\nGAFANHOTOS\n-------------------");
        System.out.println(g[0].toString());  
        System.out.println(g[1].toString());
*/
    }
    
}
