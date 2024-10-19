package br.com.fiap.timeads.api.seguranca.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "casas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Casa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String endereco;
    private String cep;
}
