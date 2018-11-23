package br.com.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.api.dto.ControleLancamentoDTO;
import br.com.api.repository.ControleLancamentoRepository;
import br.com.api.service.ControleLancamentoService;

@Service
@Transactional
public class ControleLancamentoServiceImpl implements ControleLancamentoService {
	
	@Autowired
	private ControleLancamentoRepository controleLancamentoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<ControleLancamentoDTO> getAllControleLancamento(Pageable page) {
		return controleLancamentoRepository.findAllControleLancamento(page);
	}
}