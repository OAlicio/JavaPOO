/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author Mavi da Vintch
 */
public class Luta {
    // ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //MÉTODOS PÚBLICOS
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("-------- RESULTADO --------");
            
            this.desafiado.setVida(100);
            this.desafiante.setVida(100);
            double atk1;
            double atk2;
            Random aleatorio = new Random();
            
            
            while (this.desafiado.getVida() >= 0 || this.desafiante.getVida() >= 0){
                int ataque = aleatorio.nextInt(7);
                double chance = aleatorio.nextDouble();
                //System.out.println(chance);
                double criticoDesd =  chance * ((this.desafiado.getPeso() + this.desafiado.getAltura() + this.desafiado.getIdade()) * 0.03);
                double criticoDest =  chance * ((this.desafiante.getPeso() + this.desafiante.getAltura() + this.desafiante.getIdade()) * 0.03);
                //System.out.println(criticoDesd);
                //System.out.println(criticoDest);
                
                
                System.out.println("");
                    atk1 = criticoDest * ataque;
                    this.desafiado.setVida(this.desafiado.getVida() - atk1);
                    System.out.println(this.desafiante.getNome() + " Atacou " + this.desafiado.getNome() + " com um dano de " + Math.abs(atk1));
                    System.out.format(this.desafiado.getNome() + " Ficou com %.2f", Math.abs(this.desafiado.getVida())); 
                
                

                System.out.println("");
                

                    atk2 = criticoDesd * ataque;
                    this.desafiante.setVida(this.desafiante.getVida() - atk2);
                    System.out.println(this.desafiado.getNome() + " Atacou " + this.desafiante.getNome() + " com um dano de " + Math.abs(atk2));
                    System.out.format(this.desafiante.getNome() + " Ficou com %.2f", Math.abs(this.desafiante.getVida()));   

                
                System.out.println("");
                
                if(this.desafiante.getVida() == 0) {
                    System.out.println(this.desafiado.getNome() + " VENCEU!");
                     break;
                }
                if(this.desafiado.getVida() == 0) {
                    System.out.println(this.desafiante.getNome() + " VENCEU!");
                     break;
                }
            }
            //int vencedor = aleatorio.nextInt(3); // Numero aleatorio entre os seguintes 0|1|2 
            /*switch(vencedor) {
            case 0: //EMPATE
                System.out.println("EMPATE");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
            
            case 1: //DESAFIADO VENCE
                System.out.println("Vitória do " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
                
            case 2: //DESAFIANTE VENCE
                System.out.println("Vitória do " + this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
        }*/
            System.out.println("-----------------------------");    
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
    
    
    //MÉTODOS ESPECIAIS

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
