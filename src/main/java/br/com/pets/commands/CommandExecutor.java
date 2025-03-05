package br.com.pets.commands;

public class CommandExecutor {

    public void executeCommand(Command command){
        command.execute();
    }
}
