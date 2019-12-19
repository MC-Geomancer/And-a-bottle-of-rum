package sample;

import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.omg.CORBA.portable.InputStream;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileInputStream;



public class PlayController {
	
	
	private Fields fields = new Fields();
	
	@FXML
    private ImageView pirates;
	
	@FXML
    private Button DenyButton;
	
	@FXML
    private Button ApplyButton;
	
	private String[] Files = {"/sample/Bing.fxml", "/sample/Map.fxml",
			"/sample/Repairs.fxml", "/sample/Fortune.fxml", "/sample/Messacre.fxml",
			"/sample/Shopping.fxml", "/sample/Ideals.fxml"};
	
	@FXML
    private Button SettingsButton;

    @FXML
    private Button PlayButton;

    @FXML
    private Button MenuButton;
	
	
	public void ClickOnDenyButton(ActionEvent actionEvent) throws IOException {
		fields.decrease();
		//fields.get();
		FXMLLoader loader = new FXMLLoader();
		if(fields.check()==true) {
			loader.setLocation(getClass().getResource("/sample/GameOver.fxml"));
		}
		else {
			int rand_value = (int) (Math.random()*7);
			String window  = Files[rand_value]; 
			loader.setLocation(getClass().getResource(window));
		}
        loader.load();
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    	
    }
	
	public void ClickOnApplyButton(ActionEvent actionEvent) throws IOException {
		fields.increase();
		//fields.get();
		FXMLLoader loader = new FXMLLoader();
		if(fields.check()==true) {
			loader.setLocation(getClass().getResource("/sample/GameOver.fxml"));
		}
		else {
			int rand_value = (int) (Math.random()*7);
			String window  = Files[rand_value]; 
			loader.setLocation(getClass().getResource(window));
		}
        loader.load();
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
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
        stage.setResizable(false);
        stage.show();
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
		
	}
	
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
