package navigationdrawer;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NavigationDrawer extends Application {
	public static boolean isFlashLoaded=false;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root =FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
		Scene scene= new Scene(root);
		Stage stage=new Stage();
		stage.setScene(scene);
		stage.setTitle("Spalsh Screen");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
