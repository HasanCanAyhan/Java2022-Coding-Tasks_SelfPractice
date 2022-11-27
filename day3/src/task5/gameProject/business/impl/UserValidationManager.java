package task5.gameProject.business.impl;

import task5.gameProject.Gamer;
import task5.gameProject.business.IUserValidationService;

public class UserValidationManager implements IUserValidationService {


    @Override
    public boolean validate(Gamer gamer) {

        if (gamer.getBirthYear() == 1985 && gamer.getFirstName().equalsIgnoreCase("Engin")
                && gamer.getLastName().equalsIgnoreCase("Demirog") && gamer.getIdentityNumber() == 123456){

            return true;
        }else {
            return false;
        }


    }
}
