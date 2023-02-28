package rps.gui.controller;

// Java imports
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import rps.bll.game.GameManager;
import rps.bll.player.IPlayer;
import rps.bll.player.Player;
import rps.bll.player.PlayerType;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

/**
 *
 * @author smsj
 */
public class GameViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        IPlayer human = new Player("Steffan", PlayerType.Human);
        IPlayer bot = new Player(getRandomBotName(), PlayerType.AI);

        GameManager ge = new GameManager(human, bot);
    }

    public void handleRock(ActionEvent actionEvent) {
    }

    public void handlePaper(ActionEvent actionEvent) {
    }

    public void handleScissors(ActionEvent actionEvent) {
    }

    /**
     * Famous robots...
     * @return
     */
    private String getRandomBotName() {
        String[] botNames = new String[] {
                "R2D2",
                "Mr. Data",
                "3PO",
                "Bender",
                "Marvin the Paranoid Android",
                "Bishop",
                "Robot B-9",
                "HAL"
        };
        int randomNumber = new Random().nextInt(botNames.length - 1);
        return botNames[randomNumber];
    }
}
