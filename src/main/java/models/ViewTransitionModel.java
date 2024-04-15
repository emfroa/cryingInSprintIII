package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import models.ItemData;
import models.ListModel;
import views.ClickExampleController;
import views.MainController;

public class ViewTransitionModel implements ViewTransitionModelInterface {
	BorderPane mainview;
	
	public ViewTransitionModel(BorderPane view) {
		mainview = view;
	}
	
	@Override
	public void showJobs() {
		ListModel model = new ListModel();
		initModel(model);
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("/views/jobsview.fxml"));
		try {
			Pane view = loader.load();
			mainview.setCenter(view);
			
			ClickExampleController cont = loader.getController();
			cont.setModel(model);
		    cont.showItem(model.getItems().get(0));
		  
		    

			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private void initModel(ListModel model)
	{
		model.addItem(new ItemData("Software developer","Coding is fun"));
		model.addItem(new ItemData("CSC Professor","Im so tired"));
		model.addItem(new ItemData("Engineer","help"));
		model.addItem(new ItemData("Science person","me"));
		model.addItem(new ItemData("Teacher","I JUST WANNA SLEEP LET ME SLEEP"));
		model.addItem(new ItemData("Mcdonald Worker","ITS 4 AM RN AND IM SO TIRED PLEASE LET ME SLEEP I BEG YOU"));
	}

	@Override
	public void showProfiles() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("/views/profileview.fxml"));
		try {
			Pane view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void showNews() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("/views/newsview.fxml"));
		try {
			Pane view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void showTabs() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("/views/tabsview.fxml"));
		try {
			Pane view = loader.load();
			
			mainview.setTop(view);
			
			MainController cont = loader.getController();
			ViewTransitionModel vm = new ViewTransitionModel(mainview);
			cont.setModel(vm);
			vm.showProfiles();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void showCreate() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("/views/create.fxml"));
		try {
			Pane view = loader.load();
			MainController cont = loader.getController();
			ViewTransitionModel vm = new ViewTransitionModel(mainview);
			cont.setModel(vm);
			
			
			mainview.setCenter(view);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void showLogin() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("/views/loginview.fxml"));
		try {
			Pane view = loader.load();
			
			mainview.setTop(null);
			
			MainController cont = loader.getController();
			ViewTransitionModel vm = new ViewTransitionModel(mainview);
			cont.setModel(vm);
			
			mainview.setCenter(view);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

	public void showCompany() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("/views/company.fxml"));
		try {
			Pane view = loader.load();
		
			
			mainview.setCenter(view);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
