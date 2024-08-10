/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabanco;

/**
 *
 * @author Mavi da Vintch
 */
public class Conta {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void status() {
        System.out.println("-----------------------------");
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo() + " R$");
        System.out.println("Status da conta: " + this.isStatus());
    }

    
    public void Conta(float saldo, boolean status) {
        setSaldo(0);
        setStatus(false);
    }
    
    
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
    }
        System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em divida");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void depositar(float v) {
        if (this.isStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em conta fechada");
        }
    }
    
    public void sacar(float v) {
        if (this.isStatus() == true ) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta " + this.getDono());
            } else {
            System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar em conta fechada");
        }
    }
    
    public void pagarMensal() {
        float v = 0;
        
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        } if (this.isStatus() == true) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            }
        } else {
            System.out.println("Impossível pagar em conta fechada");
        }
        
    }
    
    
    //MÉTODOS ESPECIAIS: 
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
    
}
