package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Shoes;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class ShoesController {
    @FXML
    Label nameLabel;
    @FXML
    Label priceLabel;

    @FXML
    Label priceLabel1;
    @FXML
    Label cmLabel;

    @FXML
    public void initialize() {
        Shoes nike = new Shoes("Nike Air Max", 100.0, 28.0);
        showShoes(nike);
    }

    private void showShoes(Shoes nike) {
        nameLabel.setText(nike.getName());
        priceLabel.setText(nike.getPriceInUSD());
        priceLabel1.setText(nike.getPriceInTHB());
        cmLabel.setText(nike.getSizeInCm());
    }

    @FXML
    public void onHandleBackButton(){
        try{
            FXRouter.goTo("hello");
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}