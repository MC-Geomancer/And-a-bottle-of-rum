package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingsController {

    @FXML
    private Button SettingsButton;

    @FXML
    private Button PlayButton;

    @FXML
    private Button MenuButton;

    @FXML
    private CheckBox CheckBox1;

    @FXML
    private CheckBox CheckBox2; 

	public void onClickMethodPlay(ActionEvent actionEvent) throws IOException {
        FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource("/sample/Play.fxml"));
        load.load();
        Parent root = load.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
		
	}

	public void onClickMethodMenu(ActionEvent actionEvent) throws IOException {
        FXMLLoader load = new FXMLLoader();
        load.setLocation(getClass().getResource("/sample/Menu.fxml"));
        load.load();
        Parent root = load.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
		
	}
    
}
