import { DadosDomicilioBancario } from "./dados-domicilio-bancario.model";

export class ControleLancamento {

    numeroRemessaBanco?: number;

    nomeSituacaoRemessa?: string;
	
	nomeTipoOperacao?: string;
	
	dataEfetivaLancamento?: Date;
	
	dataLancamentoContaCorrenteCliente?: Date;
	
	numeroEvento?: number;
	
	descricaoGrupoPagamento?: string;
	
	codigoIdentificadorUnico?: number;
	
	nomeBanco?: string;
	
	quantidadeLancamentoRemessa?: number;
	
	numeroRaizCNPJ?: string;
	
	numeroSufixoCNPJ?: string;
	
	valorLancamentoRemessa?: string;
	
	dateLancamentoContaCorrenteCliente?: Date;
	
	dateEfetivaLancamento?: Date;

	listaDadosDomicilioBancario?: DadosDomicilioBancario[];
	
    quantidadeLancamentos?: number;
	
	quantidadeRemessas?: number;
	
	valorLancamentos?: number;
	
}