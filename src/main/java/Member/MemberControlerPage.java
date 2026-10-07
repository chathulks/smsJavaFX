package Member;

import MyAlert.MyAlert;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MemberControlerPage {

    @FXML
    private Button add_memberBtn;

    @FXML
    private TextField address;

    @FXML
    private TextField email_text;

    @FXML
    private TextField full_nameText;

    @FXML
    private TextField member_id;

    @FXML
    private TableView<?> member_table;

    @FXML
    private TextField mobile_text;

    public void clear(){
        member_id.setText("");
        full_nameText.setText("");
        email_text.setText("");
        mobile_text.setText("");
        address.setText("");
    }

    @FXML
    void AddOnActionBtn(ActionEvent event) {
        if(member_id.getText().isEmpty()){
            MyAlert.alertMy("Warning","Please Enter Member ID","WARNING");
        } else if (full_nameText.getText().isEmpty()) {
            MyAlert.alertMy("Warning","Please Enter Full Name","WARNING");
        } else if (email_text.getText().isEmpty()) {
            MyAlert.alertMy("Warning","Please Enter Email","WARNING");
        } else if (mobile_text.getText().isEmpty()) {
            MyAlert.alertMy("Warning","Please Enter Mobile","WARNING");
        } else if (address.getText().isEmpty()) {
            MyAlert.alertMy("Warning","Please Enter Address","WARNING");
        }else {
            MyAlert.alertMy("Success","Add New Member Successful.","INFORMATION");
            clear();
        }
    }

}
