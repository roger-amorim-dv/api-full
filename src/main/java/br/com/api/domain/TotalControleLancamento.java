package br.com.api.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

public class TotalControleLancamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer quantidadeLancamentos;
	
	private Integer quantidadeRemessas;
	
	private Double valorLancamentos;
	
	@OneToMany
	private List<ControleLancamento> listaControleLancamento = new ArrayList<>();

	public Integer getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}

	public void setQuantidadeLancamentos(Integer quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}

	public Integer getQuantidadeRemessas() {
		return quantidadeRemessas;
	}

	public void setQuantidadeRemessas(Integer quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}

	public Double getValorLancamentos() {
		return valorLancamentos;
	}

	public void setValorLancamentos(Double valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}

	public List<ControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}

	public void setListaControleLancamento(List<ControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}
	
}
