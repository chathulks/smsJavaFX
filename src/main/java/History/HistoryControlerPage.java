package History;

import MyAlert.MyAlert;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HistoryControlerPage {

    @FXML
    private TextField book_title;

    @FXML
    private DatePicker due_date;

    @FXML
    private Button history_add_btn;

    @FXML
    private TableView<?> history_table;

    @FXML
    private DatePicker issuse_date;

    @FXML
    private TextField member_id;

    @FXML
    private DatePicker return_date;

    @FXML
    private ComboBox<String> status;

    @FXML
    public void initialize() {
        status.getItems().addAll("Select","Admin", "User", "Manager");
        status.setValue("Select");
    }

    public void clear(){
        member_id.setText("");
        book_title.setText("");
        status.setValue("Select");
        issuse_date.setValue(null);
        due_date.setValue(null);
        return_date.setValue(null);
    }

    @FXML
    void HistoryAddOnAction(ActionEvent event) {
        if(member_id.getText().isEmpty()){
            MyAlert.alertMy("Warning","Please Enter Member ID","WARNING");
        } else if (book_title.getText().isEmpty()) {
            MyAlert.alertMy("Warning","Please Enter Book Title","WARNING");
        } else if (status.getValue().equals("Select")) {
            MyAlert.alertMy("Warning","Please Select Status","WARNING");
        } else if (issuse_date.getValue() == null) {
            MyAlert.alertMy("Warning","Please Select Issue Date","WARNING");
        } else if (due_date.getValue() == null) {
            MyAlert.alertMy("Warning","Please Select Due Date","WARNING");
        } else if (return_date.getValue() == null) {
            MyAlert.alertMy("Warning","Please Select Return Date","WARNING");
        } else {
            MyAlert.alertMy("Success","New to add History Successful.","INFORMATION");
            clear();
        }
    }

}

