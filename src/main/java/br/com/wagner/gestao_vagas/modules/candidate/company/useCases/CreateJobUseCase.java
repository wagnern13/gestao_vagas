package br.com.wagner.gestao_vagas.modules.candidate.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wagner.gestao_vagas.exceptions.CompanyNotFoundException;
import br.com.wagner.gestao_vagas.modules.candidate.company.entities.JobEntity;
import br.com.wagner.gestao_vagas.modules.candidate.company.repositories.CompanyRepository;
import br.com.wagner.gestao_vagas.modules.candidate.company.repositories.JobRepository;

@Service
public class CreateJobUseCase {

    @Autowired
    private JobRepository jobRepository;

    private CompanyRepository companyRepository;

    public JobEntity execute(JobEntity jobEntity) {

        companyRepository.findById(jobEntity.getCompanyID()).orElseThrow(() -> {throw new CompanyNotFoundException();});
        return this.jobRepository.save(jobEntity);

    }
}
