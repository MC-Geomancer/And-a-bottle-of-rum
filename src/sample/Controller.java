package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button SettingsButton;

    @FXML
    private Button PlayButton;

    @FXML
    private Button MenuButton;
    @FXML
    void initialize()
    {
        SettingsButton.setOnAction(event->
        {
            System.out.println("Шо-то ты нажал");
        });
    }

}
