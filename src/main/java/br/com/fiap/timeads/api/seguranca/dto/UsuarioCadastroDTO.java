package br.com.fiap.timeads.api.seguranca.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioCadastroDTO(
        @NotBlank String nome,
        @Email @NotBlank String email,
        @NotBlank @Size(min = 5) String senha
) {}
