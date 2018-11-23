package br.com.api.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CTRL_LANC")
public class ControleLancamento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
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
	
	@ManyToOne
	private List<DadosDomicilioBancario> listaDadosDomicilioBancario = new ArrayList<>();

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
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<DadosDomicilioBancario> getListaDadosDomicilioBancario() {
		return listaDadosDomicilioBancario;
	}

	public void setListaDadosDomicilioBancario(List<DadosDomicilioBancario> listaDadosDomicilioBancario) {
		this.listaDadosDomicilioBancario = listaDadosDomicilioBancario;
	}

	@Override
	public String toString() {
		return "ControleLancamento [numeroRemessaBanco=" + numeroRemessaBanco + ", nomeSituacaoRemessa="
				+ nomeSituacaoRemessa + ", nomeTipoOperacao=" + nomeTipoOperacao + ", dataEfetivaLancamento="
				+ dataEfetivaLancamento + ", dataLancamentoContaCorrenteCliente=" + dataLancamentoContaCorrenteCliente
				+ ", numeroEvento=" + numeroEvento + ", descricaoGrupoPagamento=" + descricaoGrupoPagamento
				+ ", codigoIdentificadorUnico=" + codigoIdentificadorUnico + ", nomeBanco=" + nomeBanco
				+ ", quantidadeLancamentoRemessa=" + quantidadeLancamentoRemessa + ", numeroRaizCNPJ=" + numeroRaizCNPJ
				+ ", numeroSufixoCNPJ=" + numeroSufixoCNPJ + ", valorLancamentoRemessa=" + valorLancamentoRemessa
				+ ", dateLancamentoContaCorrenteCliente=" + dateLancamentoContaCorrenteCliente
				+ ", dateEfetivaLancamento=" + dateEfetivaLancamento + "]";
	}
	
}