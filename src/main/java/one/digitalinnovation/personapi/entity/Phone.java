package one.digitalinnovation.personapi.entity;

import lombok.*;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity//Indica que é uma entidade, demanda a criação de uma chave primária(@Id e @GeneratedValue)
@Data//Nos traz os Getters e Setters
@Builder
@AllArgsConstructor//Cria o construtor com todos os argumentos
@NoArgsConstructor//Cria o construtor sem argumentos(teriamos que adicioná-los com setters)
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Gera Ids diferentes sem a necessidade de fazermos na mão
    private Long id;

    @Enumerated(EnumType.STRING)//Colocar o valor do EnumType como esta na classe
    @Column(nullable = false)//Ao informar esse dado, será cadastrado como obrigatório
    private PhoneType type;

    @Column(nullable = false)
    private String Number;
}
