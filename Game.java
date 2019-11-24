import java.util.ArrayList;
import java.io.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.image.Image;
import javafx.scene.input.*;
import javafx.event.EventHandler;

public class Game extends Application {
	
	private Stage stage;
	
	public void start(Stage primaryStage) {
	    this.stage = primaryStage;

	    Group root = new Group();
		Scene scene = new Scene(root);
        
	    Canvas canvas = new Canvas(200,200);
	    root.getChildren().add(canvas);

		
	    
	    GraphicsContext gc = canvas.getGraphicsContext2D();
	    
	    Image spr;
		try {
			spr = new Image(new FileInputStream("src/Sprites/sprite-hero.png"));
			Player person = new Player(0,0,0,0,0,0,spr);
			gc.drawImage(person.getSprite(),100,100);
		    
			primaryStage.setTitle("Kitkhan Maniac");
		    primaryStage.setScene(scene);
		    primaryStage.show();

		    ArrayList<String> input = new ArrayList<String>();

	        scene.setOnKeyPressed(
	            new EventHandler<KeyEvent>()
	            {
	                public void handle(KeyEvent e)
	                {
	                    String code = e.getCode().toString();
	                    if (!input.contains(code)) {
	                        input.add(code);
	                        person.move(code);
	                		gc.drawImage(person.getSprite(),person.getPosX(),person.getPosY());
	                    }
	                }
	            });

	        scene.setOnKeyReleased(
	            new EventHandler<KeyEvent>()
	            {
	                public void handle(KeyEvent e)
	                {
	                    String code = e.getCode().toString();
	                    input.remove( code );
	                }
	            });
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}

   	public static void main(String[] args) {
   		Application.launch(args);
   	}
}
