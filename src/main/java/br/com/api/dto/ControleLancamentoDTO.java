package br.com.api.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import br.com.api.domain.ControleLancamento;
import br.com.api.domain.DadosDomicilioBancario;

public class ControleLancamentoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer numeroRemessaBanco;

	private String nomeSituacaoRemessa;
	
	private String nomeTipoOperacao;
	
	private LocalDate dataEfetivaLancamento;
	
	private LocalDate dataLancamentoContaCorrenteCliente;
	
	private Integer numeroEvento;
	
	private String descricaoGrupoPagamento;
	
	private Long codigoIdentificadorUnico;
	
	private String nomeBanco;
	
	private Long quantidadeLancamentoRemessa;
	
	private String numeroRaizCNPJ;
	
	private Integer numeroSufixoCNPJ;
	
	private Double valorLancamentoRemessa;
	
	private Integer dateLancamentoContaCorrenteCliente;
	
	private Integer dateEfetivaLancamento;
	
	private List<DadosDomicilioBancario> listaDadosDomicilioBancario;
	
    private Integer quantidadeLancamentos;
	
	private Integer quantidadeRemessas;
	
	private Double valorLancamentos;
	
	private List<ControleLancamento> listaControleLancamento;

	public ControleLancamentoDTO(){}
	
	public ControleLancamentoDTO(Integer numeroRemessaBanco, String nomeSituacaoRemessa, String nomeTipoOperacao,
			LocalDate dataEfetivaLancamento, LocalDate dataLancamentoContaCorrenteCliente, Integer numeroEvento,
			String descricaoGrupoPagamento, Long codigoIdentificadorUnico, String nomeBanco,
			Long quantidadeLancamentoRemessa, String numeroRaizCNPJ, Integer numeroSufixoCNPJ,
			Double valorLancamentoRemessa, Integer dateLancamentoContaCorrenteCliente, Integer dateEfetivaLancamento,
			List<DadosDomicilioBancario> listaDadosDomicilioBancario, Integer quantidadeLancamentos,
			Integer quantidadeRemessas, Double valorLancamentos, List<ControleLancamento> listaControleLancamento) {
		super();
		this.numeroRemessaBanco = numeroRemessaBanco;
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
		this.nomeTipoOperacao = nomeTipoOperacao;
		this.dataEfetivaLancamento = dataEfetivaLancamento;
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
		this.numeroEvento = numeroEvento;
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
		this.nomeBanco = nomeBanco;
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
		this.numeroRaizCNPJ = numeroRaizCNPJ;
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
		this.valorLancamentoRemessa = valorLancamentoRemessa;
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
		this.dateEfetivaLancamento = dateEfetivaLancamento;
		this.listaDadosDomicilioBancario = listaDadosDomicilioBancario;
		this.quantidadeLancamentos = quantidadeLancamentos;
		this.quantidadeRemessas = quantidadeRemessas;
		this.valorLancamentos = valorLancamentos;
		this.listaControleLancamento = listaControleLancamento;
	}

	public Integer getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}

	public void setNumeroRemessaBanco(Integer numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}

	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}

	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}

	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}

	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}

	public LocalDate getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	public void setDataEfetivaLancamento(LocalDate dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	public LocalDate getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	public void setDataLancamentoContaCorrenteCliente(LocalDate dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	public Integer getNumeroEvento() {
		return numeroEvento;
	}

	public void setNumeroEvento(Integer numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	public Long getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	public void setCodigoIdentificadorUnico(Long codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public Long getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	public void setQuantidadeLancamentoRemessa(Long quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	public Integer getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	public void setNumeroSufixoCNPJ(Integer numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	public Double getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	public void setValorLancamentoRemessa(Double valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	public Integer getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	public void setDateLancamentoContaCorrenteCliente(Integer dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	public Integer getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	public void setDateEfetivaLancamento(Integer dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}

	public List<DadosDomicilioBancario> getListaDadosDomicilioBancario() {
		return listaDadosDomicilioBancario;
	}

	public void setListaDadosDomicilioBancario(List<DadosDomicilioBancario> listaDadosDomicilioBancario) {
		this.listaDadosDomicilioBancario = listaDadosDomicilioBancario;
	}

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