package task5.gameProject.business.impl;

import task5.gameProject.Gamer;
import task5.gameProject.business.IUserValidationService;

public class NewEStateUserValidationManager implements IUserValidationService {
    @Override
    public boolean validate(Gamer gamer) {
        return true;
    }
}
