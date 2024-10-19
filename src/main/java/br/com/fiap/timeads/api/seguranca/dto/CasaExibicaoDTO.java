package br.com.fiap.timeads.api.seguranca.dto;

import br.com.fiap.timeads.api.seguranca.model.Casa;

public record CasaExibicaoDTO(Long id, String endereco, String cep) {
    public CasaExibicaoDTO(Casa casa) {
        this(casa.getId(), casa.getEndereco(), casa.getCep());
    }
}
