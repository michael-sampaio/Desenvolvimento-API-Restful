package br.org.serratec.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.backend.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    
}
