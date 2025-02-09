package com.example.demo_park_api.web.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class UsuarioCreateDto {


    @NotBlank
    @Email(regexp = "^[a - z0 - 9.+-]+[a - z0 - 9.-]+\\.[a - z]{2,}$", message = "Formato do e-mail inválido.")
    private String username;
    @NotBlank
    @Size(min = 6, max = 6)
    private String password;
}
