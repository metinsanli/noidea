package org.sadekod.jfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/resource/fxml/MainWindow.fxml"));
		Parent root = root = (Parent) fxmlLoader.load();
		Rectangle2D size = getScreenSize();
		
		/*
				Rectangle2D size = getScreenSize();
        Button btn = new Button();
        btn.setText("Screen Size: " + size.getWidth() + " X " + size.getHeight());
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
		Scene scene = new Scene(root, (size.getWidth()/2), (size.getHeight()/2)); 
		*/

		Scene scene = new Scene(root, (size.getWidth()/2), (size.getHeight()/2)); 

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }
	
	public Rectangle2D getScreenSize() {
	
		Rectangle2D size = Screen.getPrimary().getVisualBounds();
		
		return size;
		
	}
	
	public static void main(String[] args) {
		
        launch(args);
		
    }
}