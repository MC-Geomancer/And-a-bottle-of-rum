package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseDragEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.EventObject;

import java.io.IOException;

public class MenuController {

    @FXML
    private Button SettingsButton;

    @FXML
    private Button PlayButton;

    @FXML
    private Button MenuButton;



   /*@FXML
    void initialize()
    {
        SettingsButton.setOnAction(event->
        {
           SettingsButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/Settings.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });
    }*/
    
   public void onClickMethodSettings(ActionEvent actionEvent) throws IOException {
	    //one more way
	    //Close current
	    Stage stage = (Stage) SettingsButton.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/Settings.fxml"));
	    Parent root1 = (Parent) fxmlLoader.load();
	    stage = new Stage();
	    stage.initModality(Modality.APPLICATION_MODAL);
	    stage.setScene(new Scene(root1));
	    stage.setResizable(false);
	    stage.show();
	    
	    
	   /*FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/Settings.fxml"));
        loader.load();
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();*/
     
	}
    public void onClickMethodPlay(ActionEvent actionEvent) throws IOException {
    	
    	FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/Play.fxml"));
        loader.load();
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
	
    }
}









