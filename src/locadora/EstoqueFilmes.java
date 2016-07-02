/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author brunosette
 */
public class EstoqueFilmes extends Estoque {
    private Filmes filmes[];
    private String categoria;
    
    
    
	public EstoqueFilmes() {
		super();
	}
	
	public Filmes[] getFilmes() {
		return filmes;
	}
	public void setFilmes(Filmes[] filmes) {
		this.filmes = filmes;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "EstoqueFilmes []";
	}
    
    
    
}
