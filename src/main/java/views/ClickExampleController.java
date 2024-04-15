package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.util.Callback;
import models.ItemData;
import models.ListModel;
import models.ViewTransitionModelInterface;


public class ClickExampleController implements ShowItemInterface
{
	
    @FXML
    private TextArea itemDescription;

    @FXML
    private Label itemName;

    @FXML
    private Label numLikes;

    @FXML
    private Button onClickEdit;

    @FXML
    private Button onClickLike;

    @FXML
    private Button onClickSave;

    @FXML
    void onClickEdit(ActionEvent event) {

    }
    
    @FXML
    void onClickLike(ActionEvent event) {

    }

    @FXML
    void onClickSave(ActionEvent event) {

    }
    @FXML
    private ListView<ItemData> listview;
 
    
    ListModel model;

    
    //naming the interface so I can pass it in anonymous class below
    private final ShowItemInterface itemShower;
    
    public ClickExampleController()
    {
    	itemShower=this;
    }
    
    public void setModel(ListModel model)
    {
    	this.model = model;
    	
    	listview.setCellFactory(new Callback<ListView<ItemData>, ListCell<ItemData>>()
		  {

			@Override
			public ListCell<ItemData> call(ListView<ItemData> lv)
			{
				return new ItemListCell(lv,itemShower);
			}
		  });
    	
    	listview.setItems(model.getItems());
    	
    	
    	
    }
    
    
    @Override
	public void showItem(ItemData item)
    {
    	itemName.setText(item.getName());
    	itemDescription.setText(item.getDescription());
    }
    
    
    
    
}