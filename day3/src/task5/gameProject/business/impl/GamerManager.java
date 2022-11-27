package task5.gameProject.business.impl;

import task5.gameProject.Gamer;
import task5.gameProject.business.IGamerService;
import task5.gameProject.business.IUserValidationService;

public class GamerManager implements IGamerService {
    //MicroService

    private final IUserValidationService iUserValidationService; // DEPENDENCY INJECTION : IOC

    public GamerManager(IUserValidationService iUserValidationService) {
        this.iUserValidationService = iUserValidationService;
    }


    @Override
    public void add(Gamer gamer) {

        if (iUserValidationService.validate(gamer)){
            System.out.println("Data Added");
        }else{
            System.err.println("INVALID!");
        }

    }

    @Override
    public void update(Gamer gamer) {

        if (iUserValidationService.validate(gamer)){
            System.out.println("Data updated");
        }else {
            System.err.println("INVALID!");
        }


    }

    @Override
    public void delete(Gamer gamer) {

        if (iUserValidationService.validate(gamer)){
            System.out.println("Data deleted");
        }else {
            System.err.println("INVALID!");
        }

    }
}
