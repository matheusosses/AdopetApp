package br.com.pets.commands;

import br.com.pets.client.ClientHttpConfiguration;
import br.com.pets.service.PetService;

import java.io.IOException;

public class ImportarPetsCommand implements Command{
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petService = new PetService(client);

            petService.importarPets();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
