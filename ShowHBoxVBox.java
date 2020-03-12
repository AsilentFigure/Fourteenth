import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowHBoxVBox extends Application {
	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();
		
		pane.setTop(getHBox());
		pane.setLeft(getVBox());
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowHBoxVBox");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private HBox getHBox() {
		HBox hBox = new HBox(15);
		hBox.setPadding(new Insets(15, 15, 15, 15));
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

