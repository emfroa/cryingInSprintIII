package views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import models.ItemData;

public class ListItemCellController
{

    @FXML
    private Label itemName;

    
    ItemListCell model;
    
    public void setModel(ItemListCell cell)
    {
    	model = cell;
    }
    
    public void updateView(ItemData item)
    {
    	if(item ==null)
    	{
    		itemName.setText("");
    	}
    	else
    	{
    		itemName.setText(item.getName());
    	}
    }
    
    
    @FXML
    void onItemClicked(MouseEvent event) 
    {
    	model.showItem();
    }

}

