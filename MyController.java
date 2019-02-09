package application;
 
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.PasswordField;
public class MyController implements Initializable {
 
   @FXML
   private Button myButton;
  
   @FXML
   private TextField myTextField;
  
   
   @FXML
   private TextField login;


   @FXML
   private PasswordField pass;
   
   @FXML
   private Text label;
   
   @Override
   public void initialize(URL location, ResourceBundle resources) {
 
       // TODO (don't really need to do anything here).
      
   }
 
   // When user click on myButton
   // this method will be called.
   public void loggin(ActionEvent event) {
	   
       String log = new String(login.getText());
       String password = new String(pass.getText());
    
       if((log.equals("flickmaster420"))&&(password.equals("microExperts"))) {
    	label.setText("”ÒÔÂ¯ÌÓ!");   
       }
       else {
    	   label.setText("’¿ ≈–-’¿ ≈– ”’¿ƒ»");
       }
       }
   }
  
