package sample;

import javafx.scene.image.Image;

public class Card {
	private String Name;
	private String Description;
	private Image Image;
	
	Card(String Name, String Description){
		this.Name = Name;
		this.Description = Description;
		Image = new Image("sample/Images/carps.png");
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName( ) {
		return Name;
	}
	public void setDescription(String Description) {
		this.Description = Name;
	}
	public String getDescription( ) {
		return Description;
	}
	void setImage(Image Image) {
		this.Image = Image;
	}
	public Image getImage( ) {
		return Image;
	}
}
