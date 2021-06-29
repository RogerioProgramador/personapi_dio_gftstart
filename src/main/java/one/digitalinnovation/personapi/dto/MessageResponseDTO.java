package one.digitalinnovation.personapi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder/* com isso, a gente evita criar direto no construtor a nossa classe, permite encapsular e fazer um tratamento
dos dados de entrada*/
public class MessageResponseDTO {

    private String message;
}
