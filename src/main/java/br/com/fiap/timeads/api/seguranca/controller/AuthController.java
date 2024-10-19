package br.com.fiap.timeads.api.seguranca.controller;

import br.com.fiap.timeads.api.seguranca.dto.LoginDTO;
import br.com.fiap.timeads.api.seguranca.dto.TokenDTO;
import br.com.fiap.timeads.api.seguranca.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private TokenService tokenService;

    @PostMapping("/auth/login")
    public TokenDTO login(@RequestBody LoginDTO loginDTO) {

        String token = tokenService.gerarToken(loginDTO.email());

        return new TokenDTO(token, "Bearer");
    }
}
