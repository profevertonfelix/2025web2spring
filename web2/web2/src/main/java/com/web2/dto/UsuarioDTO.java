package com.web2.dto;

import jakarta.validation.constraints.NotBlank;

public record UsuarioDTO(@NotBlank String nome, @NotBlank String email, @NotBlank String senha) {

}
