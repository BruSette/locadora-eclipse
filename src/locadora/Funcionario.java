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
public class Funcionario extends PessoaFisica{
    private Date dataAdmiss;
    private Date dataDemiss;
    private String cargo;
    private String usuario;
    private String senha;
    private ContaBancaria conta;

    public Date getDataAdmiss() {
        return dataAdmiss;
    }

    public void setDataAdmiss(Date dataAdmiss) {
        this.dataAdmiss = dataAdmiss;
    }

    public Date getDataDemiss() {
        return dataDemiss;
    }

    public void setDataDemiss(Date dataDemiss) {
        this.dataDemiss = dataDemiss;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

	@Override
	public String toString() {
		return "Funcionario []";
	}
    
    
    
}
