package br.com.wagner.gestao_vagas.modules.candidate.company.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wagner.gestao_vagas.modules.candidate.company.entities.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {

    //findByDescriptionContaing = Select * from job where description like %filter%
    List<JobEntity> findByDescriptionContainingIgnoreCase(String filter);
}
