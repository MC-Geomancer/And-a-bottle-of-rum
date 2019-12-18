package sample;

import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.omg.CORBA.portable.InputStream;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
import javafx.stage.Stage;
import java.io.File;
import java.io.FileInputStream;



public class PlayController {
	
	
	@FXML
    private Button DenyButton;
	
	@FXML
    private Button ApplyButton;
	
	private String[] Files = {"/sample/Bing.fxml", "/sample/Old peace of paper.fxml", "/sample/Repairs.fxml", "/sample/Fortune.fxml"};
	
	
	
	public void ClickOnDenyButton(ActionEvent actionEvent) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		int rand_value = (int) (Math.random()*4);
		String name  = Files[rand_value]; 
        loader.setLocation(getClass().getResource(name));
        loader.load();
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    	
    }
	
	public void ClickOnApplyButton(ActionEvent actionEvent) throws IOException {
    	
    	
    }

}
