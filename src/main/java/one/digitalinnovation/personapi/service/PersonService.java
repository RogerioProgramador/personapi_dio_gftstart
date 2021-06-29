package one.digitalinnovation.personapi.service;

import one.digitalinnovation.personapi.dto.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service//Gerencia uma classe do tipo serviço, trata melhor suporte transacional etc
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        //RequestBody indica que esse person está vindo através de uma requisição
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created Person with ID" + savedPerson.getId())
                .build();
    }
}
