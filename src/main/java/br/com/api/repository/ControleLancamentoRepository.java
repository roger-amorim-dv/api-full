package br.com.api.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.api.domain.ControleLancamento;
import br.com.api.dto.ControleLancamentoDTO;

@Repository
public interface ControleLancamentoRepository extends JpaRepository<ControleLancamento, Long>{

	@Query(value = "SELECT * FROM CTRL_LANC ", nativeQuery = true)
	List<ControleLancamentoDTO> findAllControleLancamento(Pageable page);
}
