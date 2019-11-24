import java.util.ArrayList;

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
	    
	    Image spr = new Image("file:///C:\\Users\\erich\\eclipse-workspace\\Kitkhan-Maniac\\src\\coloredsprite.png");
	    
		Player person = new Player(0,0,0,0,0,0,spr);
		
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

//	    gc.setFill( Color.RED );
//	    gc.setStroke( Color.BLACK );
//	    gc.setLineWidth(2);
//	    gc.fillText( "Hello, World!", 60, 50 );
//	    gc.strokeText( "Hello, World!", 60, 50 );
		
		gc.drawImage(person.getSprite(),100,100);
	    
		primaryStage.setTitle("Kitkhan Maniac");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}

   	public static void main(String[] args) {
   		Application.launch(args);
   	}
}
