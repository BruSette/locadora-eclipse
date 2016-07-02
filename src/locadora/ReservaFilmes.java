/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

import java.util.Date;

/**
 *
 * @author brunosette
 */
public class ReservaFilmes {
	
	
    private Cliente cliente;
    private Funcionario funcionario;
    private Filmes filmes[];
    private Date dataReserva;
    private Date dataDevolucao;
    
    
	public ReservaFilmes() {
		super();
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Filmes[] getFilmes() {
		return filmes;
	}
	public void setFilmes(Filmes[] filmes) {
		this.filmes = filmes;
	}
	public Date getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	@Override
	public String toString() {
		return "ReservaFilmes []";
	}
    
	
}
