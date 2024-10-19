package br.com.fiap.timeads.api.seguranca.controller;

import br.com.fiap.timeads.api.seguranca.dto.CasaCadastroDTO;
import br.com.fiap.timeads.api.seguranca.dto.CasaExibicaoDTO;
import br.com.fiap.timeads.api.seguranca.service.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/casas")
public class CasaController {

    @Autowired
    private CasaService casaService;

    @GetMapping
    public List<CasaExibicaoDTO> listarTodas() {
        return casaService.listarTodas();
    }

    @PostMapping
    public CasaExibicaoDTO cadastrar(@RequestBody CasaCadastroDTO casaCadastroDTO) {
        return casaService.cadastrar(casaCadastroDTO);
    }
}
