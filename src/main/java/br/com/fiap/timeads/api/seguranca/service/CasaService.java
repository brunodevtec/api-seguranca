package br.com.fiap.timeads.api.seguranca.service;

import br.com.fiap.timeads.api.seguranca.dto.CasaCadastroDTO;
import br.com.fiap.timeads.api.seguranca.dto.CasaExibicaoDTO;
import br.com.fiap.timeads.api.seguranca.model.Casa;
import br.com.fiap.timeads.api.seguranca.repository.CasaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CasaService {

    @Autowired
    private CasaRepository casaRepository;

    public List<CasaExibicaoDTO> listarTodas() {
        return casaRepository.findAll().stream()
                .map(CasaExibicaoDTO::new)
                .collect(Collectors.toList());
    }

    public CasaExibicaoDTO cadastrar(CasaCadastroDTO casaCadastroDTO) {
        Casa casa = new Casa();
        BeanUtils.copyProperties(casaCadastroDTO, casa);
        Casa savedCasa = casaRepository.save(casa);
        return new CasaExibicaoDTO(savedCasa);
    }
}
