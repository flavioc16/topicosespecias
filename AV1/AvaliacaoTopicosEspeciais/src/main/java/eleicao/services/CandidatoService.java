package eleicao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eleicao.domain.Candidato;
import eleicao.repositories.CandidatoRepository;

@Service
public class CandidatoService {
	@Autowired
	private CandidatoRepository repositorio;
	
	public Candidato buscarCandidatos(Integer id) {
		Optional<Candidato> obj = repositorio.findById(id);
		return obj.orElse(null);
		
	}
}
