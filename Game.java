import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.canvas.*;

public class Game extends Application {
	
	private Stage stage;
	
	public void start(Stage primaryStage) {
	    this.stage = primaryStage;

	    Group root = new Group();
		Scene scene = new Scene(root);

//		final Canvas canvas = new Canvas(250,250);
//		
//	    GraphicsContext gc = canvas.getGraphicsContext2D();
	    
		primaryStage.setTitle("Kitkhan Maniac");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}

   	public static void main(String[] args) {
   		Application.launch(args);
   	}
}
