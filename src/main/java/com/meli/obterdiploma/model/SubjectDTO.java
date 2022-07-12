package com.meli.obterdiploma.model;

import lombok.Data;
import javax.validation.constraints.*;

@Data
public class SubjectDTO {
    @NotBlank(message = "O nome do assunto não pode ficar vazio.")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ]+", message = "O nome do assunto deve começar com letra maiúscula.")
    @Size(max = 30, message = "O comprimento do nome não pode exceder 30 caracteres.")
    String name;

    @DecimalMin(value = "0.0", message = "A nota mínima é 0,0.")
    @DecimalMax(value = "10.0", message = "A nota máxima é 10,0.")
    @NotNull(message ="A nota não pode estar vazia." )
    Long score;
}
