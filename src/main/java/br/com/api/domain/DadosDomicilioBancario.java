package br.com.api.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class DadosDomicilioBancario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer codigoBanco;
	private Integer numeroAgencia;
	private String numeroContaCorrente;
	
	public Integer getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
}