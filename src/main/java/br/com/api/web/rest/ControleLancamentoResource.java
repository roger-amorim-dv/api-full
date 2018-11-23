package br.com.api.web.rest;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.Timed;

import br.com.api.dto.ControleLancamentoDTO;
import br.com.api.service.ControleLancamentoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class ControleLancamentoResource {

	private final ControleLancamentoService controleLancamentoService;

	private static final int QTD_REGISTRO = 10;

	public ControleLancamentoResource(ControleLancamentoService controleLancamentoService) {
		this.controleLancamentoService = controleLancamentoService;
	}

	@GetMapping("/controle-lancamento")
	@Timed
	@ApiOperation(value = "Para realizar esse serviço é necessário passar como parâmetro um GetAll ControleLancamento")
	public ResponseEntity<List<ControleLancamentoDTO>> getAllControleLancamento(
			@ApiParam(value = "ControleLancamentoDTO") ControleLancamentoDTO controleLancamentoDTO,
			@PageableDefault(size = QTD_REGISTRO) Pageable page) {
		return ResponseEntity.status(HttpStatus.OK).body(controleLancamentoService.getAllControleLancamento(page));
	}
}
