package views;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;
import models.MainModel;
import models.ViewTransitionModel;
import models.ViewTransitionModelInterface;


public class MainController {
	ViewTransitionModelInterface model;


	  @FXML
	    private Button createAccount;

	    @FXML
	    private Button loginButton;

	    @FXML
	    private TextField password;

	    @FXML
	    private TextField username;

	    @FXML
	    void onClickCreate(ActionEvent event) {
	    	model.showCreate();
	    }
	    @FXML
	    void logout(ActionEvent event) {
	    	model.showLogin();
	    }
	    
	    @FXML
	    void company(ActionEvent event) {
	    	model.showCompany();
	    }

	    @FXML
	    void textPassword(ActionEvent event) {

	    }

	    @FXML
	    void textUsername(ActionEvent event) {

	    }
	    
	    @FXML
	    void creating(ActionEvent event) {
	    	model.showTabs();
	    }
	    
	@FXML
    void onClickLogin(ActionEvent event) {
		model.showTabs();

	}

    @FXML
    void onClickProfileEdit(ActionEvent event) {
    	System.out.println("Edited");
    }
	
	@FXML 
	void onClickJobs(ActionEvent event) {
		model.showJobs();
		System.out.println("Job Cliked");
	}
	
	@FXML 
	void onClickNews(ActionEvent event) {
		model.showNews();
		System.out.println("News Clicked");
	}
	
	@FXML 
	void onClickProfiles(ActionEvent event) {
		model.showProfiles();
		System.out.println("Profiles Clicked");
	}
	
	@FXML
	void onClickSave(ActionEvent event) {
		System.out.println("Saved");
	}
	
	@FXML
	void onClickLike(ActionEvent event) {
		System.out.println("Liked");
	}
	
	@FXML
	void onClickEdit(ActionEvent event) {
		System.out.println("Edited");
	}

	public void setModel(ViewTransitionModelInterface newModel) {
		model = newModel;
		
	}
	

	

}

