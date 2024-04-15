

import models.ViewTransitionModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import views.ClickExampleController;
import views.MainController;
import javafx.stage.Stage;

public class Halfmain extends Application{

	@Override
	public void start(Stage stage) throws Exception{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Halfmain.class.getResource("views/loginview.fxml"));
		
		
		BorderPane view = loader.load();
		MainController cont = loader.getController();
		ViewTransitionModel vm = new ViewTransitionModel(view);
		cont.setModel(vm);
		
		Scene s = new Scene(view);
		stage.setScene(s);
		
		stage.setWidth(800);
	    stage.setHeight(600);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
