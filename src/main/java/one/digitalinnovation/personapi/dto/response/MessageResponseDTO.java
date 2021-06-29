package one.digitalinnovation.personapi.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder/* com isso, a gente evita criar direto no construtor a nossa classe, permite encapsular e fazer um tratamento
dos dados de entrada*/
/*DTO = Data Transfer Object*/
public class MessageResponseDTO {

    private String message;
}
