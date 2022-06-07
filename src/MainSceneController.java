import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

public class MainSceneController {

    @FXML
    private CheckBox bteriyaki;

    @FXML
    private CheckBox bento;

    @FXML
    private CheckBox ckatsu;

    @FXML
    private CheckBox cteriyaki;

    @FXML
    private CheckBox ebitempura;

    @FXML
    private CheckBox ramen;

    @FXML
    private TextField txtharga;
    

    @FXML
    private ImageView imagedua;

    @FXML
    private ImageView imageenam;

    @FXML
    private ImageView imagelima;

    @FXML
    private ImageView imagempat;

    @FXML
    private ImageView imagesatu;

    @FXML
    private ImageView imagetiga;




public void change(ActionEvent event){

 ToggleGroup answer = new ToggleGroup();
  if (bteriyaki.isSelected()){
      txtharga.setText("Rp.40.000,00");
  }else if(ckatsu.isSelected()){
     txtharga.setText("Rp.25.000,00");
  }else if(cteriyaki.isSelected()){
    txtharga.setText("Rp.35.000,00");
  }else if(ebitempura.isSelected()){
    txtharga.setText("Rp.28.000,00");
  }else if(ramen.isSelected()){
    txtharga.setText("Rp.35.000,00");
  }else if(bento.isSelected()){
    txtharga.setText("Rp.20.000,00");
  }else {txtharga.setText(" ");
  
    }
  }
}
