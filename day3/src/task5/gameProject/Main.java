package task5.gameProject;

import task5.gameProject.business.impl.GamerManager;
import task5.gameProject.business.impl.NewEStateUserValidationManager;
import task5.gameProject.business.impl.UserValidationManager;

public class Main {

    public static void main(String[] args) {


        GamerManager gamerManager = new GamerManager(new UserValidationManager()); //new NewEStateUserValidationManager()
        gamerManager.add(new Gamer(1,"Engin","Demirog",1985,123456));


    }

}
