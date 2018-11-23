package br.com.api.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import br.com.api.dto.ControleLancamentoDTO;

public interface ControleLancamentoService {

	List<ControleLancamentoDTO> getAllControleLancamento(Pageable page);
}
