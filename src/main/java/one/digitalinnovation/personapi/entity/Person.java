package one.digitalinnovation.personapi.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity//Indica que é uma entidade, demanda a criação de uma chave primária(@Id e @GeneratedValue)
@Data//Nos traz os Getters e Setters
@Builder
@AllArgsConstructor//Cria o construtor com todos os argumentos
@NoArgsConstructor//Cria o construtor sem argumentos(teriamos que adicioná-los com setters)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Gera Ids diferentes sem a necessidade de fazermos na mão
    private Long id;

    @Column(nullable = false)//Será obrigatório informar este dado
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String cpf;

    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    //Criaremos uma lista intermediaria, com os vários telefones que uma pessoa tem.
    private List<Phone> phones;
}
