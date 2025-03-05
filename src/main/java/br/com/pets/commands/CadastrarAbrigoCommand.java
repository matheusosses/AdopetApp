package br.com.pets.commands;

import br.com.pets.client.ClientHttpConfiguration;
import br.com.pets.service.AbrigoService;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command{
    @Override
    public void execute() {
        try{
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(client);

            abrigoService.cadastrarAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
