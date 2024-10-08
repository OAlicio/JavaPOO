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
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" + "titulo = " + titulo + ", autor = " + autor + 
                "\n, totPaginas = " + totPaginas + ", pagAtual = " + pagAtual
                + ", aberto = " + aberto + "\n, leitor = " + leitor.getNome() 
                + ", idade = " + leitor.getIdade() 
                + ", sexo = " + leitor.getSexo() + '}';
    }

    
//MÉTODO CONSTRUTOR DO LIVRO:
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
    
    
    //MÉTODOS ESPECIAIS GETTER E SETTER:
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //MÉTODOS ABSTRACTOS
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void autor() {
        
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas){
           this.pagAtual = 0;
        } else {
           this.pagAtual = p; 
        }
        
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
    
}
