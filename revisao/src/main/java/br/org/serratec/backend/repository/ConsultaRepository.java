package br.org.serratec.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    
}
